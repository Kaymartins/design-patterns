package org.example;

public class DeactivatedState implements VehicleState{
    @Override
    public String allocate(VehicleType vehicle) {
        return vehicle.getVehicleId() + " desativado. Operação bloqueada.";
    }

    @Override
    public String returnToBase(VehicleType vehicle) {
        return vehicle.getVehicleId() + " desativado. Operação bloqueada.";
    }

    @Override
    public String startMaintenance(VehicleType vehicle) {
        return vehicle.getVehicleId() + " desativado. Operação bloqueada.";
    }

    @Override
    public String finishMaintenance(VehicleType vehicle) {
        return vehicle.getVehicleId() + " desativado. Operação bloqueada.";
    }

    @Override
    public String deactivate(VehicleType vehicle) {
        return vehicle.getVehicleId() + " já está desativado.";
    }

    @Override
    public String reportStatus() {
        return "veículo está DESATIVADO.";
    }
}
