package org.example;

public class UnavailableState implements VehicleState{
    @Override
    public String allocate(VehicleType vehicle) {
        return vehicle.getVehicleId() + " já está alocado.";
    }

    @Override
    public String returnToBase(VehicleType vehicle) {
        vehicle.setState(new AvailableState());
        return vehicle.getVehicleId() + " retornou e está disponível.";
    }

    @Override
    public String startMaintenance(VehicleType vehicle) {
        return "Não é possível iniciar manutenção durante uma alocação.";
    }

    @Override
    public String finishMaintenance(VehicleType vehicle) {
        return vehicle.getVehicleId() + " não está em manutenção.";
    }

    @Override
    public String deactivate(VehicleType vehicle) {
        return "Não é possível desativar um veículo alocado.";
    }

    @Override
    public String reportStatus() {
        return "veículo está ALOCADO.";
    }
}
