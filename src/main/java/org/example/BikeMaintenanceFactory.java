package org.example;

public class BikeMaintenanceFactory implements MaintenanceFactory{
    @Override
    public Engine createEngine() {
        return new PedalSystem();
    }

    @Override
    public BrakeSystem createBrakeSystem() {
        return new DiscBreakes();
    }
}
