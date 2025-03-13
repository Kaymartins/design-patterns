package org.example;

public class VehicleMetro extends AbstractVehicle {
    public VehicleMetro(String vehicleId) {
        super(vehicleId);
    }

    @Override
    public String startEngine() {
        // Metrô geralmente é elétrico ou não tem "motor" tradicional
        return "Metrô " + getVehicleId() + ": Sistema elétrico ativado.";
    }

    @Override
    public String stopEngine() {
        return "Metrô " + getVehicleId() + ": Sistema elétrico desativado.";
    }

    @Override
    public MaintenanceFactory getMaintenanceFactory() {
        return new MetroMaintenanceFactory(); // Supondo que existe essa fábrica
    }
}
