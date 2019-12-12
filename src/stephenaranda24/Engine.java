package stephenaranda24;

import java.util.Date;
/**
 * This interface contains the methods necessary for the specifications of an Engine.
 *
 * @author Stephen Aranda
 * @version 1.0
 * @since 2019-11-03
 */
public interface Engine {

  /**
   * This method is the mutator/setter method for the engine cylinder of a vehicle. It makes it so
   * you can change its value.
   *
   * @param engineCylinders An integer value that represents the number of engine cylinders.
   */
  public void setEngineCylinders(int engineCylinders);

  /**
   * This method is the mutator/setter method for the engine cylinder of a vehicle. It makes it so
   * you can change its value.
   *
   * @param date An object of the date class that represents the current date.
   */
  public void setEngineManufacturedDate(Date date);

  /**
   * This method is the mutator/setter method for the engine cylinder of a vehicle. It makes it so
   * you can change its value.
   *
   * @param manufacturer A string value that represents the manufacturer of an engine.
   */
  public void setEngineManufacturer(String manufacturer);

  /**
   * This method is the mutator/setter method for the engine make of a vehicle. It makes it so you
   * can change its value.
   *
   * @param engineMake A string value that represents the engine make of the vehicle.
   */
  public void setEngineMake(String engineMake);

  /**
   * This method is the mutator/setter method for the engine model of a vehicle. It makes it so you
   * can change its value.
   *
   * @param engineModel A string value that represents the engine model of the vehicle.
   */
  public void setEngineModel(String engineModel);

  /**
   * This method is the mutator/setter method for the drive train of a vehicle. It makes it so you
   * can change its value.
   *
   * @param driveTrain A string value that represents the drive train.
   */
  public void setDriveTrain(String driveTrain);

  /**
   * This method is the mutator/setter method for the engine type of a vehicle. It makes it so you
   * can change its value.
   *
   * @param fuel A string value that represents the type of fuel for the engine.
   */
  public void setEngineType(String fuel);
}
