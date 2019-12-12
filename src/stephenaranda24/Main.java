package stephenaranda24;

import java.util.Date;
/**
 * This class is the driver for this program.
 *
 * @author Stephen Aranda
 * @version 1.0
 * @since 2019-11-03
 */
public class Main {

  /** {@inheritDoc} */
  public static void main(String[] args) {

    // testVehicleChassis();
    // testVehicleFrame();
    // testManufacturedEngine();
    // testFeatures();
    // testVehicle();
    testCar();
  }

  /** This method tests the VehicleChassis class and its constructor. */
  public static void testVehicleChassis() {
    // Creates two objects, one with the default constructor
    // and the other with the constructor with parameters.
    // Give sample data for the parameters.

    VehicleChassis myChassis = new VehicleChassis();
    System.out.println(myChassis.toString());

    VehicleChassis yourChassis = new VehicleChassis("cn");
    System.out.println(yourChassis.toString());
  }
  /** This method tests the VehicleFrame class and its constructor(s). */
  public static void testVehicleFrame() {
    // Step 4 Test
    VehicleFrame vf1 = new VehicleFrame();
    System.out.println(vf1);

    VehicleFrame vf2 = new VehicleFrame("Ladder Frame");
    System.out.println(vf2);
  }
  /** This method tests the ManufacturedEngine class and its constructor(s). */
  public static void testManufacturedEngine() {
    ManufacturedEngine me1 = new ManufacturedEngine();
    System.out.println(me1);

    ManufacturedEngine me2 =
        new ManufacturedEngine(
            "Honda", new Date(), "H-Series", "H23A1", "2WD: Two-Wheel Drive", 4, "88 AKI");
    System.out.println(me2);
  }
  /** This method tests the Features class and its constructor(s). */
  public static void testFeatures() {
    InteriorFeature if1 = new InteriorFeature();
    System.out.println(if1);

    InteriorFeature if2 = new InteriorFeature("Climate Control");
    System.out.println(if2);

    ExteriorFeature ef1 = new ExteriorFeature();
    System.out.println(ef1);

    ExteriorFeature ef2 = new ExteriorFeature("Fog Lamps");
    System.out.println(ef2);
  }
  /** This method tests the Vehicle class and its constructor(s). */
  public static void testVehicle() {
    Vehicle v1 = new Vehicle();
    System.out.println(v1);

    Vehicle v2 =
        new Vehicle(
            new Date(),
            "Honda",
            "Prelude",
            "Coupe",
            new VehicleChassis("Unibody"),
            "null",
            "type",
            new ManufacturedEngine(
                "Honda", new Date(), "H-series", "H23A1", "88 AKI", 4, "2WD: Two-Wheel Drive"));
    System.out.println(v2);
  }
  /** This method tests the Car class and its constructor(s). */
  public static void testCar() {

    // Test default constructor and print instance attributes.
    Car c1 = new Car();
    System.out.println(c1);
    System.out.println();

    // Seed the features with valid subclasses.
    Feature[] f = {
      new InteriorFeature("AM/FM Radio"),
      new InteriorFeature("Air Conditioning"),
      new ExteriorFeature("Wood Panels"),
      new ExteriorFeature("Moonroof")
    };

    // Create an overloaded Car instance.
    Car c2 =
        new Car(
            new Date(),
            "Honda",
            "Prelude",
            "Coupe",
            new VehicleChassis("Unibody"),
            "null",
            "type",
            new ManufacturedEngine(
                "Honda", new Date(), "H-series", "H23A1", "88 AKI", 4, "2WD: Two-Wheel Drive"),
            f,
            2);
    System.out.println(c2);
  }
}
