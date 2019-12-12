package stephenaranda24;
/**
 * This interface contains the methods needed for changing and accessing the features.
 *
 * @author Stephen Aranda
 * @version 1.0
 * @since 2019-11-03
 */
public interface Feature {
  /**
   * This is the accessor/getter method for the feature of this vehicle.
   *
   * @return A string value that represents this exterior feature.
   */
  public String getFeature();
  /**
   * This is the mutator/setter method for the feature of this vehicle.
   *
   * @param feature A string value that represents the feature of this vehicle.
   */
  public void setFeature(String feature);
}
