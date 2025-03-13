package org.example;

public class MetroMaintenanceFactory implements MaintenanceFactory {
    @Override
    public Engine createEngine() {
        return new ElectricEngine();
    }

    @Override
    public BrakeSystem createBrakeSystem() {
        return new ElectromagneticBrakes();
    }
}
