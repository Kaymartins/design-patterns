package org.example;

public abstract class VehicleDecorator implements  VehicleType{
    protected VehicleType decoratedVehicle;

    public VehicleDecorator(VehicleType vehicle) {
        this.decoratedVehicle = vehicle;
    }

    @Override
    public Engine getEngine() {
        return null;
    }

    @Override
    public BrakeSystem getBrakes() {
        return null;
    }

    @Override
    public String startEngine() {
        return decoratedVehicle.startEngine();
    }

    @Override
    public String stopEngine() {
        return decoratedVehicle.stopEngine();
    }

    @Override
    public String getVehicleId() {
        return decoratedVehicle.getVehicleId();
    }

    public VehicleState getState(){
        return decoratedVehicle.getState();
    }

    public String allocate(){
        return decoratedVehicle.allocate();
    }

    public String returnToBase(){
        return decoratedVehicle.returnToBase();
    }

    public String startMaintenance(){
        return decoratedVehicle.startMaintenance();
    }

    public String finishMaintenance(){
        return decoratedVehicle.finishMaintenance();
    }

    public String deactivate(){
        return decoratedVehicle.deactivate();
    }

    public String reportStatus(){
        return decoratedVehicle.reportStatus();
    }

    public void setState(VehicleState state){
        decoratedVehicle.setState(state);
    }
}
