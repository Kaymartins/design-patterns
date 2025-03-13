package org.example;

public class BikeController extends VehicleController {

    public BikeController(VehicleType vehicleType) {
        super(vehicleType);
    }

    public void operate(){
        vehicle.startEngine();
    }
}
