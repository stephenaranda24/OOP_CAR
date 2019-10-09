package io.github.stephenaranda24;

public class VehicleChassis implements Chassis {
  private String chassisName;

  public VehicleChassis(){
    this.chassisName = Chassis.chassis;
  }

  public VehicleChassis(String chassisName){
    this.chassisName = chassisName;
  }

public Chassis getChassisType(){
    return this;
}
}
