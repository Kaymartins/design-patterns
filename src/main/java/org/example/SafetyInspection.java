package org.example;

public abstract class SafetyInspection {
    public final String performCheck(Engine engine, BrakeSystem brakes) {
        String engineCheck = checkEngine(engine);
        String brakesCheck = checkBrakes(brakes);
        return engineCheck + "\n" + brakesCheck + "\n" + generateReport();
    }

    protected abstract String checkEngine(Engine engine);
    protected abstract String checkBrakes(BrakeSystem brakes);

    public String generateReport(){
        return "Relatório gerado";
    }
}
