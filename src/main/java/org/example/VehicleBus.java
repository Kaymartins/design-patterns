package org.example;

public class VehicleBus extends AbstractVehicle {
    private String vehicleId;
    private VehicleState state;

    VehicleBus(String vehicleId){
        super(vehicleId);
    }

    @Override
    public String startEngine() {
        return "Ônibus " + getVehicleId() + ": Motor diesel ligado.";
    }

    @Override
    public String stopEngine() {
        return "Ônibus " + getVehicleId() + ": Motor diesel desligado.";
    }

    @Override
    public MaintenanceFactory getMaintenanceFactory() {
        return new BusMaintenanceFactory();
    }
}
