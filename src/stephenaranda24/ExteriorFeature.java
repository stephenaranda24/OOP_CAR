package stephenaranda24;
/**
 * This class implements the Feature interface along with all of its methods.
 *
 * @author Stephen Aranda
 * @version 1.0
 * @since 2019-11-03
 */
public class ExteriorFeature implements Feature {

  private String exteriorFeature;

  /** This is the default constructor for the ExteriorFeature class. */
  public ExteriorFeature() {
    this.exteriorFeature = "Generic";
  }

  /**
   * This is an overloaded constructor for the ExteriorFeature class, it has the string value of the
   * exterior feature as the parameter.
   *
   * @param exteriorFeature A string value that represents the exterior feature of this vehicle.
   */
  public ExteriorFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }

  /** {@inheritDoc} */
  public String getFeature() {
    return this.exteriorFeature;
  }

  /** {@inheritDoc} */
  public void setFeature(String feature) {
    this.exteriorFeature = feature;
  }

  /**
   * The formatter for the string values of information.
   *
   * @return String values that represent the exterior features.
   */
  public String toString() {
    return "Exterior [" + this.exteriorFeature + "]";
  }
}
