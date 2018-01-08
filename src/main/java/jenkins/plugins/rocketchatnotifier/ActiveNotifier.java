package jenkins.plugins.rocketchatnotifier;

import edu.umd.cs.findbugs.annotations.SuppressWarnings;
import hudson.model.*;
import hudson.scm.ChangeLogSet;
import hudson.scm.ChangeLogSet.AffectedFile;
import hudson.scm.ChangeLogSet.Entry;
import hudson.triggers.SCMTrigger;
import org.apache.commons.lang.StringUtils;

import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Martin Reinhardt (hypery2k)
 */
@SuppressWarnings("rawtypes")
public class ActiveNotifier implements FineGrainedNotifier {

  private static final Logger LOGGER = Logger.getLogger(RocketChatNotifier.class.getName());

  RocketChatNotifier notifier;
  BuildListener listener;

  public ActiveNotifier(RocketChatNotifier notifier, BuildListener listener) {
    super();
    this.notifier = notifier;
    this.listener = listener;
  }

  private RocketClient getRocket(AbstractBuild r) throws IOException {
    return notifier.newRocketChatClient(r, listener);
  }

  public void deleted(AbstractBuild r) {
  }

  public void started(AbstractBuild build) {

    try {
      CauseAction causeAction = build.getAction(CauseAction.class);

      if (causeAction != null) {
        Cause scmCause = causeAction.findCause(SCMTrigger.SCMTriggerCause.class);
        if (scmCause == null) {
          MessageBuilder message = new MessageBuilder(notifier, build, false);
          message.append(causeAction.getShortDescription());
          notifyStart(build, message.appendOpenLink().toString());
          // Cause was found, exit early to prevent double-message
          return;
        }
      }

      String changes = getChanges(build, notifier.includeCustomMessage(), false);
      if (changes != null) {
        notifyStart(build, changes);
      } else {
        notifyStart(build, getBuildStatusMessage(build, false, notifier.includeCustomMessage(), false));
      }
    } catch (IOException e) {
      LOGGER.info("Could not send rocket message");
    }
  }

  private void notifyStart(AbstractBuild build, String message) throws IOException {
    getRocket(build).publish(message);
  }

  public void finalized(AbstractBuild r) {
  }

  public void completed(AbstractBuild r) {
    try {
      if (LOGGER.isLoggable(Level.INFO)) {
        LOGGER.info("Build completed. Checking for rocket notifiers");
      }
      if (r != null) {
        AbstractProject<?, ?> project = r.getProject();
        Result result = r.getResult();
        if (project != null) {
          AbstractBuild<?, ?> previousBuild = project.getLastBuild();
          if (previousBuild != null) {
            do {
              previousBuild = previousBuild.getPreviousCompletedBuild();
            } while (previousBuild != null && previousBuild.getResult() == Result.ABORTED);
            Result previousResult = (previousBuild != null) ? previousBuild.getResult() : Result.SUCCESS;
            if ((result == Result.ABORTED && notifier.getNotifyAborted())
              || (result == Result.FAILURE //notify only on single failed build
              && previousResult != Result.FAILURE
              && notifier.getNotifyFailure())
              || (result == Result.FAILURE //notify only on repeated failures
              && previousResult == Result.FAILURE
              && notifier.getNotifyRepeatedFailure())
              || (result == Result.NOT_BUILT && notifier.getNotifyNotBuilt())
              || (result == Result.SUCCESS
              && (previousResult == Result.FAILURE || previousResult == Result.UNSTABLE)
              && notifier.getNotifyBackToNormal())
              || (result == Result.SUCCESS && notifier.getNotifySuccess())
              || (result == Result.UNSTABLE && notifier.getNotifyUnstable())) {
              getRocket(r).publish(
                getBuildStatusMessage(r, notifier.includeTestSummary(), notifier.includeCustomMessage(), true),
                getEmoji(r),
                getAvatar(r),
                getAttachments(r));//, getBuildColor(r));
              /*if (notifier.getCommitInfoChoice().showAnything()) {
                getRocket(r).publish(getCommitList(r),
                  getEmoji(r),
                  getAvatar(r));//, getBuildColor(r));
              }*/
            }
          }
        }
      }
    } catch (IOException e) {
      LOGGER.info("Could not send rocket message");
    }
  }

  private List<Map<String, Object>> getAttachments(AbstractBuild r) {
    List<Map<String, Object>> attachments = new ArrayList<>();

    Map<String, Object> statusAttachment = new HashMap<>();
    statusAttachment.put("color", getBuildColor(r));
    statusAttachment.put("title", getTitle(r));
    statusAttachment.put("text", getText(r));
    attachments.add(statusAttachment);

    if (notifier.getCommitInfoChoice().showAnything()) {
      Map<String, Object> commitListAttachment = new HashMap<>();
      commitListAttachment.put("text", getCommitList(r));
      attachments.add(commitListAttachment);
    }
    return attachments;
  }

  private String getText(AbstractBuild r) {
    List<Result> badResults = Arrays.asList(Result.FAILURE, Result.ABORTED);
    String culprits = StringUtils.join(r.getCulprits(), ", ");
    if (badResults.contains(r.getResult())) {
      return "Kröhöm " + culprits + "...";
    }
    return "Kiitos " + culprits + "!";
  }

  private String getTitle(AbstractBuild r) {
    List<Result> badResults = Arrays.asList(Result.FAILURE, Result.ABORTED);
    if (badResults.contains(r.getResult())) {

      return "SON. I AM DISAPPOINT! VOISIKO JOKU KORJATA??";
    }
    return "SON. I AM PROUD!";
  }

  private String getBuildColor(AbstractBuild r) {
    List<Result> redColors = Arrays.asList(Result.FAILURE, Result.ABORTED);
    if (redColors.contains(r.getResult())) {
      return "#ff0000";
    }
    return "#00ff00";
  }

  private String getAvatar(AbstractBuild r) {
    return "https://oda.medidemo.fi/ci/static/c0bc6b40/images/headshot.png";
  }

  private String getEmoji(AbstractBuild r) {
    return null;
  }

  String getChanges(AbstractBuild r, boolean includeCustomMessage, boolean finished) {
    if (!r.hasChangeSetComputed()) {
      LOGGER.info("No change set computed...");
      return null;
    }
    ChangeLogSet changeSet = r.getChangeSet();
    List<Entry> entries = new LinkedList<Entry>();
    Set<AffectedFile> files = new HashSet<AffectedFile>();
    for (Object o : changeSet.getItems()) {
      Entry entry = (Entry) o;
      LOGGER.info("Entry " + o);
      entries.add(entry);
      files.addAll(entry.getAffectedFiles());
    }
    if (entries.isEmpty()) {
      LOGGER.info("Empty change...");
      return null;
    }
    Set<String> authors = new HashSet<String>();
    for (Entry entry : entries) {
      authors.add(entry.getAuthor().getDisplayName());
    }
    MessageBuilder message = new MessageBuilder(notifier, r, finished);
    message.append("Started by changes from ");
    message.append(StringUtils.join(authors, ", "));
    message.append(" (");
    message.append(files.size());
    message.append(" file(s) changed)");
    message.appendOpenLink();
    if (includeCustomMessage) {
      message.appendCustomMessage();
    }
    return message.toString();
  }

  String getCommitList(AbstractBuild r) {
    ChangeLogSet changeSet = r.getChangeSet();
    List<Entry> entries = new LinkedList<Entry>();
    for (Object o : changeSet.getItems()) {
      Entry entry = (Entry) o;
      LOGGER.info("Entry " + o);
      entries.add(entry);
    }
    if (entries.isEmpty()) {
      LOGGER.info("Empty change...");
      Cause.UpstreamCause c = (Cause.UpstreamCause) r.getCause(Cause.UpstreamCause.class);
      if (c == null) {
        return "No Changes.";
      }
      String upProjectName = c.getUpstreamProject();
      int buildNumber = c.getUpstreamBuild();
      AbstractProject project = Hudson.getInstance().getItemByFullName(upProjectName, AbstractProject.class);
      if (project != null) {
        AbstractBuild upBuild = project.getBuildByNumber(buildNumber);
        return getCommitList(upBuild);
      }
    }
    Set<String> commits = new HashSet<String>();
    for (Entry entry : entries) {
      StringBuffer commit = new StringBuffer();
      CommitInfoChoice commitInfoChoice = notifier.getCommitInfoChoice();
      if (commitInfoChoice.showTitle()) {
        commit.append(entry.getMsg());
      }
      if (commitInfoChoice.showAuthor()) {
        commit.append(" [").append(entry.getAuthor().getDisplayName()).append("]");
      }
      commits.add(commit.toString());
    }
    MessageBuilder message = new MessageBuilder(notifier, r, true);
    message.append("Changes:\n- ");
    message.append(StringUtils.join(commits, "\n- "));
    return message.toString();
  }

  String getBuildStatusMessage(AbstractBuild r, boolean includeTestSummary, boolean includeCustomMessage, boolean finished) {
    MessageBuilder message = new MessageBuilder(notifier, r, finished);
    message.append("@here ");
    message.appendStatusMessage();
    message.appendDuration();
    message.appendOpenLink();
    if (includeTestSummary) {
      message.appendTestSummary();
    }
    if (includeCustomMessage) {
      message.appendCustomMessage();
    }
    return message.toString();
  }

}
