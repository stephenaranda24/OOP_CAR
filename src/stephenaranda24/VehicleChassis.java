package stephenaranda24;
/**
 * This concrete class implements the Chassis interface and its methods.
 *
 * @author Stephen Aranda
 * @version 1.0
 * @since 2019-11-03
 */
public class VehicleChassis implements Chassis {
  private String chassisName;

  /** Default constructor for the VehicleChassis class. */
  public VehicleChassis() {
    this.chassisName = chassis;
  }
  /** Overloaded constructor for the VehicleChassis class.
   * @param chassisName A string value that represents the chassis name of this vehicle.
   * */
  public VehicleChassis(String chassisName) {
    this.chassisName = chassisName;
  }
  /** {@inheritDoc} */
  public Chassis getChassisType() {
    return this;
  }

  // Implement method
  /** {@inheritDoc} */
  public void setChassisType(String vehicleChassis) {
    this.chassisName = vehicleChassis;
  }
  /** {@inheritDoc} */
  public String toString() {
    return "Chassis Name : " + this.chassisName;
  }
}
