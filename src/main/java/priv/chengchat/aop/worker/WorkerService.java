package priv.chengchat.aop.worker;

import java.util.concurrent.TimeUnit;
import priv.chengchat.aop.service.FeatureExperimentImpl;
import priv.chengchat.aop.service.VersionExperimentImpl;

public class WorkerService {


  private final FeatureExperimentImpl featureExperiment = new FeatureExperimentImpl();
  private final VersionExperimentImpl versionExperiment = new VersionExperimentImpl();

  public void work() {
    while (true) {
      featureExperiment.calcNumberA(3, 5);
      mockWorkCost();

      versionExperiment.useNewVersion();
      mockWorkCost();
    }

  }

  private static void mockWorkCost() {
    try {
      TimeUnit.SECONDS.sleep(3);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
