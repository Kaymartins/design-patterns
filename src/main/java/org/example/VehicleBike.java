package org.example;

public class VehicleBike extends AbstractVehicle {
    public VehicleBike(String vehicleId, MaintenanceFactory factory) {
        super(vehicleId, factory);
    }

    @Override
    public String startEngine() {
        // Bicicleta não tem motor, mas pode ser elétrica
        return "Bicicleta " + getVehicleId() + ": Em uso.";
    }

    @Override
    public String stopEngine() {
        return "Bicicleta " + getVehicleId() + ": fora de uso.";
    }
}
