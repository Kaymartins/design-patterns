package org.example;

public class VehicleMetro extends AbstractVehicle {
    public VehicleMetro(String vehicleId, MaintenanceFactory factory) {
        super(vehicleId, factory);
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

}
