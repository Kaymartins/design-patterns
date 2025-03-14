package org.example;

import java.util.Observable;

public abstract class AbstractVehicle extends Observable implements VehicleType, Cloneable {
    private String vehicleId;
    private VehicleState state;
    private final Engine engine;
    private final BrakeSystem brakes;

    public AbstractVehicle(String vehicleId, MaintenanceFactory factory){
        this.vehicleId = vehicleId;
        this.engine = factory.createEngine();
        this.brakes = factory.createBrakeSystem();
        this.state = new AvailableState();
        this.addObserver(FleetMonitor.getInstance());
    }

    @Override
    public Engine getEngine() {
        return engine;
    }

    @Override
    public BrakeSystem getBrakes() {
        return brakes;
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

    @Override
    public AbstractVehicle clone() throws CloneNotSupportedException {
        AbstractVehicle cloned = (AbstractVehicle) super.clone();
        cloned.deleteObservers();
        cloned.addObserver(FleetMonitor.getInstance());
        return cloned;
    }

    protected void setVehicleId(String newId) {
        this.vehicleId = newId;
    }
}
