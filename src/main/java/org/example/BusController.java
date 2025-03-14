package org.example;

public class BusController extends VehicleController{

    public BusController(VehicleType vehicleType) {
        super(vehicleType);
    }

    @Override
    public String operate() {
        return vehicle.startEngine();
    }
}
