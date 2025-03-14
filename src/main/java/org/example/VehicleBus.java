package org.example;

public class VehicleBus extends AbstractVehicle {

    VehicleBus(String vehicleId, MaintenanceFactory factory) {
        super(vehicleId, factory);
    }

    @Override
    public String startEngine() {
        return "Ônibus " + getVehicleId() + ": Motor diesel ligado.";
    }

    @Override
    public String stopEngine() {
        return "Ônibus " + getVehicleId() + ": Motor diesel desligado.";
    }
}
