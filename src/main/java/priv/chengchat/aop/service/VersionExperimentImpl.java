package priv.chengchat.aop.service;

public class VersionExperimentImpl implements VersionExperiment {

  @Override
  public void useNewVersion() {
//    System.out.println("experimentEnable closed executing useNewVersion");
    System.out.println("executing new version");
  }

  @Override
  public void useOldVersion() {
//    System.out.println("experimentEnable opened, executing useOldVersion");
    System.out.println("executing old version");
  }
}
