package org.example;

public class MetroController extends VehicleController {
    public MetroController(VehicleType vehicle) {
        super(vehicle);
    }

    public String operate(){
        return vehicle.startEngine();
    }
}
