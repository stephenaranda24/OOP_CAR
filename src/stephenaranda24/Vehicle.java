package stephenaranda24;

import java.util.Date;
/**
 * This concrete class implements the Engine interface and its methods along with the Chassis
 * interface and its methods.
 *
 * @author Stephen Aranda
 * @version 1.0
 * @since 2019-11-03
 */
public class Vehicle implements Engine, Chassis {
  Date vehicleManufacturedDate;
  String vehicleManufacturer;
  String vehicleMake;
  String vehicleModel;
  Chassis vehicleFrame;
  String vehicleType;
  String driveTrain;
  Engine vehicleEngine;

  /** Default constructor for the Vehicle class. */
  public Vehicle() {
    this.vehicleManufacturedDate = new Date();
    this.vehicleManufacturer = "Generic";
    this.vehicleMake = "Generic";
    this.vehicleModel = "Generic";
    this.vehicleType = "Generic";
    this.vehicleFrame = new VehicleFrame();
    this.vehicleEngine = new ManufacturedEngine();
    this.vehicleEngine.setEngineType("Generic");
    this.vehicleEngine.setDriveTrain("Generic");
  }

  /**
   * Overlaoded constructor for the Vehicle class.
   *
   * @param vehicleManufacturedDate An object of the Date class that represents the current date.
   * @param vehicleManufacturer A string value that represents the manufacturer of the vehicle.
   * @param vehicleMake A string value that represents the make of the vehicle.
   * @param vehicleModel A string value that represents the model of the vehicle.
   * @param vehicleFrame A string value that represents the frame of the vehicle.
   * @param vehicleType A string value that represents the type of the vehicle.
   * @param driveTrain A string value that represents the drive train.
   * @param vehicleEngine An object of Engine class that represents the engine of the vehicle.
   */
  public Vehicle(
      Date vehicleManufacturedDate,
      String vehicleManufacturer,
      String vehicleMake,
      String vehicleModel,
      Chassis vehicleFrame,
      String vehicleType,
      String driveTrain,
      Engine vehicleEngine) {

    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    this.vehicleEngine = vehicleEngine;
  }
  /** {@inheritDoc} */
  @Override
  public void setEngineCylinders(int engineCylinders) {
    vehicleEngine.setEngineCylinders(engineCylinders);
  }
  /** {@inheritDoc} */
  @Override
  public void setEngineManufacturedDate(Date date) {
    vehicleEngine.setEngineManufacturedDate(date);
  }
  /** {@inheritDoc} */
  @Override
  public void setEngineManufacturer(String manufacturer) {
    this.vehicleManufacturer = manufacturer;
  }
  /** {@inheritDoc} */
  @Override
  public void setEngineMake(String engineMake) {
    this.vehicleEngine.setEngineMake(engineMake);
  }
  /** {@inheritDoc} */
  @Override
  public void setEngineModel(String engineModel) {
    this.vehicleEngine.setEngineModel(engineModel);
  }
  /** {@inheritDoc} */
  @Override
  public void setDriveTrain(String driveTrain) {
    this.vehicleEngine.setDriveTrain(driveTrain);
  }
  /** {@inheritDoc} */
  @Override
  public void setEngineType(String fuel) {
    this.vehicleEngine.setEngineType(fuel);
  }
  /** {@inheritDoc} */
  @Override
  public Chassis getChassisType() {
    return vehicleFrame;
  }
  /** {@inheritDoc} */
  @Override
  public void setChassisType(String vehicleChassis) {
    this.vehicleFrame.setChassisType(vehicleChassis);
  }
  /** {@inheritDoc} */
  public String toString() {
    // Print instance description.
    return "Manufacturer Name : "
        + this.vehicleManufacturer
        + "\n"
        + "Manufactured Date : "
        + this.vehicleManufacturedDate.toString()
        + "\n"
        + "Vehicle Make : "
        + this.vehicleMake
        + "\n"
        + "Vehicle Model : "
        + this.vehicleModel
        + "\n"
        + "Vehicle Type : "
        + this.vehicleType
        + "\n"
        + vehicleEngine.toString();
  }
}
