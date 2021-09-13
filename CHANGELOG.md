# [](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v1.4.0...v) (2021-09-13)


### Bug Fixes

* **API:** Use latest info REST API ([e756c22](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/e756c22d7fa79a890829d608d7f3503af453caae))
* **Config:** Correct jelly rocketServerURL value ([#69](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/69)) ([08d33e0](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/08d33e0dc80f3c35105ecbecf29bd61ee1160a13))
* **Config:** Resolve config param naming error [JENKINS-59503] ([f35f535](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/f35f535eb7666266ce01296bf8567450c350585b))
* **Config:** Resolve config save error [JENKINS-59149] ([05c758f](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/05c758f75f583da6b124cfa803aa7e8907e0a995))
* **deps:** Fix enforcer failure due to credentials upgrade ([#55](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/55)) ([d39d9d1](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/d39d9d139e6a2a59b2ddd9dc004cc3a48249f2b4))
* **Error Handlung:** Add error string to response for further logging ([#100](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/100)) ([9dd4d3e](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/9dd4d3e2a82fdcfb412c60e39e84f88671b5e6f8))
* **Jenkins URL:** use JenkinsLocationConfiguration.get() (JENKINS-59153) ([#54](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/54)) ([1ec2e45](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/1ec2e4511af612511677e957dc7a1b5cede5dfdc))
* **Logging:** Improve logging for JENKINS-59149 ([c74509b](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/c74509be45fcbe5996bf8b82690831d3ce34031b))
* **Message sent:** Improve error handling ([ec36a79](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/ec36a797f5fc823f83edf3d19d521884987bb613))
* pom.xml to reduce vulnerabilities ([42593b6](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/42593b6ecf6602d0f52e6c1cc4ca19ba6b5584dd))
* pom.xml to reduce vulnerabilities ([3a410e6](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/3a410e6f409c45269ca276c85a6844dc9bdba711))
* **RocketChatClientCallBuilder:** fix proxy access without credentials (JENKINS-55890) ([4d27927](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/4d279276549a9d8a723ba234cc138eb8de48468a))
* **Security:** pom.xml to reduce vulnerabilities ([#73](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/73)) ([3d886e6](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/3d886e65f68f229358b785b0250ae886721cac0c))
* **Settings:** Fixes not being able to save custom message ([940eb15](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/940eb15b1e49d34ff12188275af05d1da49e1217))


### Features

* **Authentication:** Adding support for personal token login ([4108174](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/4108174cbeb7a4f95a095c224168e485909b3f0e))
* **Build:** Using GitHub Actions ([7145223](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/71452231dfc13b83483761fa8d3d9cf711247067))
* **JCasC:** Adding old branch for JCasC compatibility ([9544fe5](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/9544fe5c59e8543b2fe4bae915b2188183b4b86c))
* **JDK:** Support for Java 11 ([c0712bc](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/c0712bc537a3b704af04ea5d1f67b90b9a17dbc9))
* **Message:** Adding color support ([2c69a63](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/2c69a637f7982bb12f44f8ab8c4837e49c8c91d1))
* **Pipeline:** Allow to customize server while using rocketSend step ([7bea98c](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/7bea98c9b127a54e2e64b26d315f878fb10b384f))
* **Pipeline:** Allow to customize server while using rocketSend step([JENKINS-58315](https://issues.jenkins-ci.org/browse/JENKINS-58315)) ([f97d1fa](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/f97d1fa5a40851e472d69ba7e5e50cdff19c0b52))
* **Testing:** Adding most recent rocketchat versions ([89c5381](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/89c53815b1949948184826d63d27aec96c640d6b))



# [1.4.0](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v1.3.3...v1.4.0) (2019-01-26)


### Bug Fixes

* **Install:** Drop compatible error during install ([4bd24fb](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/4bd24fb00849075dbbbeee6d853ac5b0b0cb8122))


### Features

* **Webhook:** Support webhooks in plugin config ([c3a27b7](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/c3a27b744d9248a6b32f37d5e756f34653382d6d))



## [1.3.3](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v1.3.2...v1.3.3) (2019-01-22)


### Bug Fixes

* **build:** Only deploy master ([bd26eb1](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/bd26eb16f0356b8774d3ce3f93bdaa9ea0e8ecc1))
* **Build:** Resolve build issues on OpenJDK CI nodes ([4b8c1c0](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/4b8c1c09a3d1582113079f6332961a727ba183cf))
* **Configuration:** Auto-Add https:// if no protocol was given ([e19d174](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/e19d1741389fa2b51a34a4bdeb724172dc2ad156))
* **Connections-Pooling:** Use PoolingHttpClientConnectionManager to fix multiple requests ([f718cf2](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/f718cf2648df6fcdbd6618087ad8359052d93f15))
* **deploy:** Correct Maven Deploy logic (#JENKINS-52383) ([8adf86e](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/8adf86e7887877f0950518e74c6e484990a1d208)), closes [#JENKINS-52383](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-52383)
* **Error-Handling:** Avoid possible NPE ([c49d31e](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/c49d31eeaaaec415439ba769eb218d117c5ecbbe))
* **MessageAttachment:** Change type string to boolean ([#25](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/25)) ([e3b9eaa](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/e3b9eaab23d763ace0ca1c60a8e64e2fc3052750))
* **NPE:** Corrected NPE error (#JENKINS-50448) ([808242c](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/808242c473834b99cf6aac08f7895945fc619cca)), closes [#JENKINS-50448](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-50448)
* obey channel parameter for messages sent via webhook ([503780d](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/503780d838aa02f03607ee9b9ed14287ef7d08cb))
* **Plugin-URL:** Set correct plugin url ([d4f361a](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/d4f361ac4ad79aeb274467e737838f0d3bd02f2a)), closes [#21](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/21)
* pom.xml to reduce vulnerabilities ([38fd3ab](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/38fd3ab6afbc2cb8ce22d2721c2b4f1624481684))
* pom.xml to reduce vulnerabilities ([5b6885c](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/5b6885cebd8f5ecfaae40e0644e849477162accd))
* pom.xml to reduce vulnerabilities ([e6ab323](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/e6ab323af41eb043e7ffc2869f7aff84f8a50da3))
* **proxy:** Corrected proxy config (JENKINS-47858) ([1403cb6](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/1403cb67fe98855f8309bab83fcae625db630f4b))
* **Proxy:** Proxy detection with nested URIs and different Ports  ([9b6431c](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/9b6431c822af99b26414059e729d98f046a49057))
* **Security:** Update Jackson to fix [CVE-2018-14719](https://app.snyk.io/vuln/SNYK-JAVA-COMFASTERXMLJACKSONCORE-72450) ([f8c16be](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/f8c16beeb92631c4adbc6ab4b4925cab23f1259d))
* **SNI:** upgraded the http client to support SNI. (#JENKINS-48905) ([bb738ad](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/bb738ad645cde736868331af07bae480f434206f)), closes [#JENKINS-48905](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-48905)
* **SSL-Config:** Use ssl settings in client, too ([5202e06](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/5202e06a22a943fa0bf450e43e3667fb494148c8))
* **ssl:** Corrected SSL Validation ([89400a0](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/89400a066cdd564b2d07b5a5c8f653499a710d84))
* **Tests:** Make ITs work again ([7f065e2](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/7f065e22cc68095a26fcb428e694ec15ca23e28f))


### Features

* **Attachments:** Adding attachment send to normal jobs ([ca4b80a](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/ca4b80a94e3fe415b63cebf4e2fc682fbcd846ee))



# [1.2.0](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v1.1.2...v1.2.0) (2018-02-15)


### Bug Fixes

* **proxy-error:** Resolve #JENKINS-47858 ([074a5e0](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/074a5e0266f2a809391905817713a6f88b85434d)), closes [#JENKINS-47858](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-47858)
* **use-defaults:** applying global defaults ([4a8bdf7](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/4a8bdf77dc58c6e817b269fe0fe4adc14a5b270d)), closes [#JENKINS-48486](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-48486)
* **use-defaults:** applying global defaults ([673b6ea](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/673b6ea3880dd6c7b72ba9805829801a73870830)), closes [#JENKINS-48486](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-48486)



## [1.1.2](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v1.1.1...v1.1.2) (2018-01-25)


### Bug Fixes

* **JSON:** Corrected form data usage ([JENKINS-47858](https://issues.jenkins-ci.org/browse/JENKINS-47858)) ([2781961](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/27819612ac0c6e9fc5c29075603a7e09cab40c75))



## [1.1.1](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v1.1.0...v1.1.1) (2018-01-10)


### Bug Fixes

* **NPE:** Fix typo (see #https://issues.jenkins-ci.org/browse/JENKINS-48185) ([52c57a3](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/52c57a3e9f0593d4bd1db7cbb0226504a14f9724))
* **NPE:** Resolve null pointer issue (see #https://issues.jenkins-ci.org/browse/JENKINS-48185) ([dd53f96](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/dd53f969c554f3449b327d1caa4a359c175cde96))
* **proxy-config:** Refactor proxy config ([9d28f53](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/9d28f53267363dcefa2640410d1ba0e9e8054f2c))



# [1.0.0](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v0.5.5...v1.0.0) (2017-11-15)


### Bug Fixes

* **duration-display:** Fix for duration label error ([28c8594](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/28c85943044516531c6894207042e5bc09c0b4f6))
* **error-handling:** Improved error handling for special characters in fields (see #JENKINS-47858) ([2a3a542](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/2a3a5420334653e3749b707ca48601e1d432d280)), closes [#JENKINS-47858](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-47858)
* **NPE:** Resolve null pointer in error log ([94b7308](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/94b73083e731d54b04bfb6f562fa7fe2f5140237)), closes [#JENKINS-47841](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-47841)


### Features

* **coverage:** Adding code coverage ([dfe4b4e](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/dfe4b4e0d5df97dfef25f0af22ecd8aa42cd0c71))



## [0.5.3](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v0.5.2...v0.5.3) (2017-09-13)


### Features

* **drop-old-rocket-api:** Drop support for older rocket.chat versions ([40dad98](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/40dad98a5c355da7772d2a656f746e3200d3143b))



## [0.5.2](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v0.5.1...v0.5.2) (2017-07-13)



## [0.5.1](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v0.5.0...v0.5.1) (2017-06-02)


### Bug Fixes

* **message-label:** Corrected message label ([451b497](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/451b497e7931b1e01cc72d5545d5ad57758e2105))



# [0.5.0](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v0.4.4...v0.5.0) (2017-02-10)


### Bug Fixes

* **NPE:** Corrected NPE error. ([583b847](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/583b84794f73297881b42f4cc9d3a425b28bff7e)), closes [#JENKINS-41436](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-41436)
* **status-msg:** Corrected status message ([724c625](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/724c625d9bc76494c16d5c80cef16667a10328aa)), closes [#JENKINS-41680](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-41680)


### Features

* add the posibility to send attachments. ([c56748e](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/c56748e3b19171b7b7c17b3cf455fe4cbd5ad485))



## [0.4.4](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v0.4.1...v0.4.4) (2016-12-30)


### Bug Fixes

* **build:** Use name for plugin ([e99f771](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/e99f771ae4263ddf9377a7cc5baad16fbbf25263))
* **dependencies:** resolve classpath error ([c88cb48](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/c88cb483de335eed3a6a8062f7fc24237bd00b93))
* **docker-tests:** Fix docker setup (see #JENKINS-40673) ([52c6316](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/52c6316100303a0fc3c7da1051cc40db149c89f7)), closes [#JENKINS-40673](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40673)
* **findbugs:** resolve findbugs error ([c972250](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/c9722500246bee2a79aa9bd0cce0c2ee9e32ef6a))


### Features

* **new-rocket-api:** first basic implementation (see #JENKINS-40595) ([ebb346e](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/ebb346e876075fb3fc23734aff43f3e65414cf5d)), closes [#JENKINS-40595](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40595)
* **new-rocket-api:** Implement message sending (see #JENKINS-40595) ([162812b](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/162812b251244fe70bd4577b09e0a215614d2686)), closes [#JENKINS-40595](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40595)
* **new-rocket-api:** Let integration tests respect RocketChat version (see #JENKINS-40595 and #JENKINS-40673) ([603e6af](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/603e6affd6b8de1be3d32d1b5180116868e9b9c7)), closes [#JENKINS-40595](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40595) [#JENKINS-40673](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40673)
* **new-rocket-api:** Let integration tests respect RocketChat version (see #JENKINS-40595 and #JENKINS-40673) ([aa9614f](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/aa9614f28bf253cd7c2216c54ce559dd0c7d196e)), closes [#JENKINS-40595](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40595) [#JENKINS-40673](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40673)
* **new-rocket-api:** Run tests against multiple rocketchat versions (see #JENKINS-40595 and #JENKINS-40673) ([0cd495d](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/0cd495d3a2e4b70984c89a9933b497f90403131b)), closes [#JENKINS-40595](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40595) [#JENKINS-40673](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40673)
* **new-rocket-api:** Support old legacy API, too (see #JENKINS-40595) ([08d8b42](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/08d8b4280e11e3011aa3b346a7ba97b7c39e1031)), closes [#JENKINS-40595](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40595)
* **new-rocket-api:** Use docker tests in Travis Build (see #JENKINS-40595 and #JENKINS-40673) ([e477881](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/e47788198878a38d6a7d181573dd7f11215a0ddc)), closes [#JENKINS-40595](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40595) [#JENKINS-40673](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40673)
* **testing:** Implement basic integration test (see #JENKINS-40673) ([01c249d](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/01c249dbb88b379ac1c8bd4fc483921eee856bbc)), closes [#JENKINS-40673](https://github.com/jenkinsci/rocketchatnotifier-plugin/issues/JENKINS-40673)



# [0.3.0](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v0.2.1...v0.3.0) (2016-12-09)


### Bug Fixes

* **error_handling:** Improved error handling ([4c51838](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/4c518384d6e73017844ead2a5dc07b9edb4c9699))


### Features

* **debugging:** Improved logging ([87f2d71](https://github.com/jenkinsci/rocketchatnotifier-plugin/commit/87f2d714304411c8ea3efcd96369840a983bef1c))



## [0.2.1](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v0.1.2...v0.2.1) (2016-09-27)



## [0.1.2](https://github.com/jenkinsci/rocketchatnotifier-plugin/compare/v0.2.0...v0.1.2) (2016-09-16)



# 0.2.0 (2016-09-16)



