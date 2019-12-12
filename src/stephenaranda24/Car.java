package stephenaranda24;

import java.util.Date;

/**
 * This concrete class inherits all of the fields and methods from the Vehicle class.
 *
 * @author Stephen Aranda
 * @version 1.0
 * @since 2019-11-03
 */
public final class Car extends Vehicle {
  private Feature[] feature = new Feature[10];
  private int carAxle;

  /** This is the constructor method for the Car class with no parameters. */
  public Car() {
    super();
    Feature[] f = {
      new InteriorFeature("No Interior Features"), new ExteriorFeature("No Exterior Features")
    };
    this.feature = f;
    this.carAxle = 2;
  }

  /**
   * This is an overloaded constructor method for the car class that takes in the date the vehicle
   * was manufactured, the vehicle manufacturer, its make, model, frame, type, drive train, engine,
   * features, and the car axel as the parameters.
   *
   * @param vehicleManufacturedDate An object of the Date class that represents the current date.
   * @param vehicleManufacturer A string value that represents the vehicle manufacturer.
   * @param vehicleMake A string value that represents the make of the vehicle.
   * @param vehicleModel A string value that represents the model of the vehicle.
   * @param vehicleFrame An object of the Chassis class that represents the frame of the vehicle.
   * @param vehicleType A string that represents the type of vehicle.
   * @param driveTrain A string that represents the drive train of the vehicle.
   * @param vehicleEngine An object of the Engine class that represents the engine of the vehicle.
   * @param feature An array of features of the car.
   * @param carAxle A integer value that represents the car axle of the vehicle.
   */
  public Car(
      Date vehicleManufacturedDate,
      String vehicleManufacturer,
      String vehicleMake,
      String vehicleModel,
      Chassis vehicleFrame,
      String vehicleType,
      String driveTrain,
      Engine vehicleEngine,
      Feature[] feature,
      int carAxle) {
    super(
        vehicleManufacturedDate,
        vehicleManufacturer,
        vehicleMake,
        vehicleModel,
        vehicleFrame,
        vehicleType,
        driveTrain,
        vehicleEngine);

    // Sets the number of car axles.
    this.feature = feature;
    this.carAxle = carAxle;
  }

  /**
   * This method reads the exterior features of the car into a list and separates them by commas
   *
   * @return The list of features is returned.
   */
  public String getExteriorFeatures() {
    String list = "";

    // reads features into list sepereated by commas
    for (int i = 0; i < this.feature.length; i++) {

      if (this.feature[i] instanceof ExteriorFeature) {
        if (list.length() == 0) {
          list += this.feature[i];
        } else {
          list += "\n" + this.feature[i];
        }
      }
    }
    return list;
  }
  /**
   * This method reads the interior features of the car into a list and separates them by commas
   *
   * @return The list of features is returned.
   */
  public String getInteriorFeatures() {
    String list = "";

    // reads the features into a list seperated by commas.
    for (int i = 0; i < this.feature.length; i++) {

      if (this.feature[i] instanceof InteriorFeature) {
        if (list.length() == 0) {
          list += this.feature[i];
        } else {
          list += "\n" + this.feature[i];
        }
      }
    }

    return list;
  }

  /** {@inheritDoc} */
  public String toString() {

    String list = "";

    // Read the features into a comma separated list.
    for (int i = 0; i < this.feature.length; i++) {
      if (list.length() == 0) {
        list += this.feature[i];
      } else {
        list += "\n" + this.feature[i];
      }
    }

    return super.toString() + "\n" + "Features : " + "\n" + list + "\n" + "Car Axle : " + carAxle;
  }
}
