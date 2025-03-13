package org.example;

public abstract class VehicleController {
    protected VehicleType vehicle;

    public VehicleController(VehicleType vehicleType) {
        this.vehicle = vehicleType;
    }

    public abstract void operate();
}
