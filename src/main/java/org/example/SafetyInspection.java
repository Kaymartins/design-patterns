package org.example;

public abstract class SafetyInspection {
    public final String performCheck(VehicleType vehicle) {
        String engineCheck = checkEngine(vehicle.getEngine());
        String brakesCheck = checkBrakes(vehicle.getBrakes());
        return engineCheck + "\n" + brakesCheck + "\n" + generateReport();
    }

    protected abstract String checkEngine(Engine engine);
    protected abstract String checkBrakes(BrakeSystem brakes);

    public String generateReport(){
        return "Relatório gerado";
    }
}
