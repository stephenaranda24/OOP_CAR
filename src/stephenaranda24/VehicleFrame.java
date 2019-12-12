package stephenaranda24;

/**
 * This concrete class implements the Chassis interface and its methods.
 *
 * @author Stephen Aranda
 * @version 1.0
 * @since 2019-11-03
 */
public class VehicleFrame implements Chassis {
  private String vehicleFrameType;

  /** Default constructor for the VehicleFrame class. */
  public VehicleFrame() {
    this.vehicleFrameType = "Unibody";
  }

  /**
   * An overloaded constructor for the VehicleFrame class.
   *
   * @param vehicleFrameType A string value that represents the frame type of this vehicle.
   */
  public VehicleFrame(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }

  /** @return */
  public Chassis getChassisType() {
    return this;
  }
  /** {@inheritDoc} */
  public void setChassisType(String vehicleFrameType) {
    this.vehicleFrameType = vehicleFrameType;
  }
  /** {@inheritDoc} */
  public String toString() {
    return "Chassis : " + chassis + "\n" + "Vehicle Frame : " + this.vehicleFrameType;
  }
}
