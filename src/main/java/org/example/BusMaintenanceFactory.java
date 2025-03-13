package org.example;

public class BusMaintenanceFactory implements MaintenanceFactory{

    @Override
    public Engine createEngine() {
        return new DieselEngine();
    }

    @Override
    public BrakeSystem createBrakeSystem() {
        return new AirBrakes();
    }
}
