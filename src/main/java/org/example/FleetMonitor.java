package org.example;

import java.util.Observable;
import java.util.Observer;

public class FleetMonitor implements Observer {
    private static FleetMonitor instance;
    private StringBuilder logs = new StringBuilder();

    private FleetMonitor() {}

    public static FleetMonitor getInstance() {
        if (instance == null) {
            instance = new FleetMonitor();
        }

        return instance;
    }

    @Override
    public void update(Observable observable, Object arg){
        if(observable instanceof AbstractVehicle){
            AbstractVehicle vehicle = (AbstractVehicle)observable;
            String vehicleId = vehicle.getVehicleId();
            String stateName = arg.getClass().getSimpleName();
            String logEntry = "Veículo " + vehicleId + " / Estado: " + stateName;
            logs.append(logEntry);
//            System.out.println("[FLEET MONITOR] " + logEntry);
        }
    }

    public String getLogs() {
        return logs.toString();
    }
}
