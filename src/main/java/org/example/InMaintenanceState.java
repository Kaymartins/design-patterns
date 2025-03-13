package org.example;

public class InMaintenanceState implements VehicleState{
    @Override
    public String allocate(VehicleType vehicle) {
        return vehicle.getVehicleId() + " em manutenção. Alocação bloqueada.";
    }

    @Override
    public String returnToBase(VehicleType vehicle) {
        return vehicle.getVehicleId() + " não alocado.";
    }

    @Override
    public String startMaintenance(VehicleType vehicle) {
        return "Manutenção já está em andamento.";
    }

    @Override
    public String finishMaintenance(VehicleType vehicle) {
        vehicle.setState(new AvailableState());
        return "Manutenção concluída. " + vehicle.getVehicleId() + " disponível.";
    }

    @Override
    public String deactivate(VehicleType vehicle) {
        vehicle.setState(new DeactivatedState());
        return vehicle.getVehicleId() + " desativado durante a manutenção.";
    }

    @Override
    public String reportStatus() {
        return "veículo está EM MANUTENÇÃO.";
    }
}
