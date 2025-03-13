package org.example;

import java.util.Observable;

public abstract class AbstractVehicle extends Observable implements VehicleType {
    private String vehicleId;
    private VehicleState state;

    public AbstractVehicle(String vehicleId){
        this.vehicleId = vehicleId;
        this.state = new AvailableState();
        this.addObserver(FleetMonitor.getInstance());
    }

    @Override
    public String getVehicleId() {
        return vehicleId;
    }

    @Override
    public void setState(VehicleState state) {
        this.state = state;
        setChanged();
        notifyObservers(state);
    }

    @Override
    public VehicleState getState() {
        return state;
    }

    @Override
    public String allocate() {
        return state.allocate(this);
    }

    @Override
    public String returnToBase() {
        return state.returnToBase(this);
    }

    @Override
    public String startMaintenance() {
        return state.startMaintenance(this);
    }

    @Override
    public String finishMaintenance() {
        return state.finishMaintenance(this);
    }

    @Override
    public String deactivate() {
        return state.deactivate(this);
    }

    @Override
    public String reportStatus() {
        return state.reportStatus();
    }
}
