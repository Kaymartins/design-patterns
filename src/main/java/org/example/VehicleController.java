package org.example;

public abstract class VehicleController {
    public VehicleType vehicle;

    public VehicleController(VehicleType vehicleType) {
        this.vehicle = vehicleType;
    }

    public abstract String operate();
}
