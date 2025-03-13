package org.example;

public class AvailableState implements VehicleState{
    @Override
    public String allocate(VehicleType vehicle) {
        vehicle.setState(new UnavailableState());
        return vehicle.getVehicleId() + " alocado.";
    }

    @Override
    public String returnToBase(VehicleType vehicle) {
        return vehicle.getVehicleId() + " já está disponível.";
    }

    @Override
    public String startMaintenance(VehicleType vehicle) {
        vehicle.setState(new InMaintenanceState());
        return vehicle.getVehicleId() + " enviado para manutenção.";
    }

    @Override
    public String finishMaintenance(VehicleType vehicle) {
        return vehicle.getVehicleId() + " não está em manutenção.";
    }

    @Override
    public String deactivate(VehicleType vehicle) {
        vehicle.setState(new DeactivatedState());
        return vehicle.getVehicleId() + " desativado permanentemente.";
    }

    public String reportStatus() {
        return "veículo DISPONÍVEL para ser alocado.";
    }
}
