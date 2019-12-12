package stephenaranda24;
/**
 * This interface contains the methods needed for a Vehicles Chassis.
 *
 * @author Stephen Aranda
 * @version 1.0
 * @since 2019-11-03
 */
public interface Chassis {

  public final String chassis = "Chassis";

  /**
   * This method is the accessor/setter method for the type of Chassis of a vehicle. chassis
   * interface.
   *
   * @return An instance of the Chassis interface.
   */
  public Chassis getChassisType();

  /**
   * This method is the mutator/getter method for the type of Chassis of a vehicle.
   *
   * @param vehicleChassis A string value that represents the chassis of the vehicle.
   */
  public void setChassisType(String vehicleChassis);
}
