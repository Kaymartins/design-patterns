package org.example;

public interface VehicleType {
    String startEngine();
    String stopEngine();
    String getVehicleId();
    Engine getEngine();
    BrakeSystem getBrakes();

    void setState(VehicleState state);
    VehicleState getState();

    String allocate();
    String returnToBase();
    String startMaintenance();
    String finishMaintenance();
    String deactivate();
    String reportStatus();
}
