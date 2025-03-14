package org.example;

public class BikeController extends VehicleController {

    public BikeController(VehicleType vehicleType) {
        super(vehicleType);
    }

    public String operate(){
        return vehicle.startEngine();
    }
}
