package jenkins.plugins.rocketchatnotifier.rocket;

import hudson.ProxyConfiguration;
import jenkins.model.Jenkins;
import jenkins.plugins.rocketchatnotifier.rocket.errorhandling.RocketClientException;
import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.JenkinsRule;
import org.mockito.Mock;

public class RocketChatClientCallBuilderIT {

  @Mock
  private Jenkins jenkins;
  @Rule
  public JenkinsRule j = new JenkinsRule();


  @Test(expected = RocketClientException.class)
  public void shouldEscapeSpecialCharacters() throws Exception {
    // given
    Jenkins.getInstance().proxy = null;
    RocketChatClientCallBuilder rocketCallBuilder = new RocketChatClientCallBuilder("http://localhost", false, "]\",", "]\",");
    // when
    rocketCallBuilder.buildCall(RocketChatRestApiV1.ChannelsList);
    // then error
  }
  @Test(expected = RocketClientException.class)
  public void shouldWorkWithProxy() throws Exception {
    // given
    Jenkins.getInstance().proxy = new ProxyConfiguration("sample1", 1234);
    RocketChatClientCallBuilder rocketCallBuilder = new RocketChatClientCallBuilder("http://localhost", false, "]\",", "]\",");
    // when
    rocketCallBuilder.buildCall(RocketChatRestApiV1.ChannelsList);
    // then error
  }
}
