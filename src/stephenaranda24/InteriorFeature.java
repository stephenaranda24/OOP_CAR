package stephenaranda24;
/**
 * This concrete class implements the Feature interface along with all of its methods.
 *
 * @author Stephen Aranda
 * @version 1.0
 * @since 2019-11-03
 */
public class InteriorFeature implements Feature {
  private String interiorFeature;

  /** The default constructor of the InteriorFeature class. */
  public InteriorFeature() {
    this.interiorFeature = "Generic";
  }

  /**
   * An overloaded constructor of the InteriorFeature class.
   *
   * @param interiorFeature A string value that represent the interior feature of this vehicle.
   */
  public InteriorFeature(String interiorFeature) {
    this.interiorFeature = interiorFeature;
  }

  /** {@inheritDoc} */
  public String getFeature() {
    return this.interiorFeature;
  }

  /** {@inheritDoc} */
  public void setFeature(String feature) {
    this.interiorFeature = feature;
  }
  /** {@inheritDoc} */
  public String toString() {
    return "Interior [" + this.interiorFeature + "]";
  }
}
