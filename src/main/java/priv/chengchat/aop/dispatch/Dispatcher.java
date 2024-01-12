package priv.chengchat.aop.dispatch;

import java.util.Scanner;
import priv.chengchat.aop.properties.ExperimentProperties;

public class Dispatcher {

  private final Scanner scanner = new Scanner(System.in);

  public void dispatch() {
    while (scanner.hasNext()) {
      try {
        boolean enable = scanner.nextBoolean();
        ExperimentProperties.experimentEnable(enable);
        System.out.println("the switch has been switched, experimentEnable = " + ExperimentProperties.experimentEnable());
      } catch (Throwable ignored) {
      }
    }
  }
}
