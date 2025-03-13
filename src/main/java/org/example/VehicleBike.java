package org.example;

public class VehicleBike extends AbstractVehicle {
    public VehicleBike(String vehicleId) {
        super(vehicleId);
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

    @Override
    public MaintenanceFactory getMaintenanceFactory() {
        return new BikeMaintenanceFactory();
    }
}
