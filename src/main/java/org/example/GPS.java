package org.example;

public class GPS extends VehicleDecorator{
    public GPS(VehicleType vehicle) {
        super(vehicle);
    }

    @Override
    public String startEngine() {
        String originalMessage = super.startEngine();
        String gpsMessage = "GPS ativado para " + getVehicleId();
        return originalMessage + "\n" + gpsMessage;
    }

    public String getLocation() {
        return "Localização atual: Latitude X, Longitude Y";
    }

}
