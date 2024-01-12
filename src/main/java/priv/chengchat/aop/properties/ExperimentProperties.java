package priv.chengchat.aop.properties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExperimentProperties {


  private static final ExperimentProperties experimentProperties = new ExperimentProperties();
  private boolean experimentEnable;

  public static void experimentEnable(boolean enable) {
    experimentProperties.setExperimentEnable(enable);
  }

  public static boolean experimentEnable() {
    return experimentProperties.isExperimentEnable();
  }
}
