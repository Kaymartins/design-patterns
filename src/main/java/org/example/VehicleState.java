package org.example;

public interface VehicleState {
    String allocate(VehicleType vehicle);
    String returnToBase(VehicleType vehicle);
    String startMaintenance(VehicleType vehicle);
    String finishMaintenance(VehicleType vehicle);
    String deactivate(VehicleType vehicle);
    String reportStatus();
}
