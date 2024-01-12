package priv.chengchat.aop.service;

public class FeatureExperimentImpl implements FeatureExperiment {

//  @Experiment(
//      name = "experiment",
//      targetClass = priv.chengchat.aop.ExperimentDemo.class,
//      targetMethod = "calcNumberB"
//  )
  @Override
  public void calcNumberA(int a, int b) {
//    System.out.println("experimentEnable closed executing calcNumberA");
    System.out.println("performing addition operation, result = " + (a + b));
  }

  @Override
  public void calcNumberB(int a, int b) {
//    System.out.println("experimentEnable opened, executing calcNumberB");
    System.out.println("performing multiplication operation, result = " + (a * b));
  }

}
