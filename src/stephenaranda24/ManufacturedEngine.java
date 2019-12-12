package stephenaranda24;

import java.util.Date;
/**
 * This concrete class implements the Engine interface along with its methods.
 *
 * @author Stephen Aranda
 * @version 1.0
 * @since 2019-11-03
 */
public class ManufacturedEngine implements Engine {
  private String engineManufacturer;
  private Date engineManufacturedDate;
  private String engineMake;
  private String engineModel;
  private int engineCylinders;
  private String engineType;
  private String driveTrain;

  /** The default constructor for the ManufacturedEngine class. */
  public ManufacturedEngine() {

    this.engineManufacturer = "Generic";
    this.engineManufacturedDate = new Date();
    this.engineMake = "Generic";
    this.engineModel = "Generic";
    this.engineCylinders = 0;
    this.engineType = "85 AKI";
    this.driveTrain = "2WD: Two-Wheel Drive";
  }

  /**
   * Overlaoded constructor for the ManufacturedEngine class.
   *
   * @param engineManufacturer String value that represents the engine manufacturer.
   * @param engineManufacturedDate An object of the Date class that represents the current date.
   * @param engineMake A string value that represents the engine make.
   * @param engineModel A string value that represents the engine model.
   * @param engineType A string value that represents the engine type.
   * @param engineCylinders An integer value that represents the number of cylinders for this
   *     engine.
   * @param driveTrain A string value that represents the drive train.
   */
  public ManufacturedEngine(
      String engineManufacturer,
      Date engineManufacturedDate,
      String engineMake,
      String engineModel,
      String engineType,
      int engineCylinders,
      String driveTrain) {

    this.engineManufacturer = engineManufacturer;
    this.engineManufacturedDate = engineManufacturedDate;
    this.engineMake = engineMake;
    this.engineModel = engineModel;
    this.driveTrain = driveTrain;
    this.engineCylinders = engineCylinders;
    this.engineType = engineType;
  }

  /** {@inheritDoc} */
  public final void setEngineManufacturedDate(Date date) {
    this.engineManufacturedDate = date;
  }
  /** {@inheritDoc} */
  public final void setEngineManufacturer(String manufacturer) {
    this.engineManufacturer = manufacturer;
  }
  /** {@inheritDoc} */
  public void setEngineMake(String engineMake) {
    this.engineMake = engineMake;
  }
  /** {@inheritDoc} */
  public void setEngineModel(String engineModel) {
    this.engineModel = engineModel;
  }
  /** {@inheritDoc} */
  public final void setEngineType(String fuel) {
    this.engineType = fuel;
  }
  /** {@inheritDoc} */
  public void setEngineCylinders(int engineCylinders) {
    this.engineCylinders = engineCylinders;
  }
  /** {@inheritDoc} */
  public void setDriveTrain(String driveTrain) {
    this.driveTrain = driveTrain;
  }
  /** {@inheritDoc} */
  public String toString() {
    // Print instance description.
    return "Engine Manufacturer : "
        + this.engineManufacturer
        + "\n"
        + "Engine Manufactured : "
        + this.engineManufacturedDate.toString()
        + "\n"
        + "Engine Make : "
        + this.engineMake
        + "\n"
        + "Engine Model : "
        + this.engineModel
        + "\n"
        + "Engine Type : "
        + this.engineType
        + "\n"
        + "Engine Cylinders : "
        + this.engineCylinders
        + "\n"
        + "Drive Train : "
        + this.driveTrain;
  }
}
