package org.example;

public class MetroInspection extends  SafetyInspection{

    @Override
    protected String checkEngine(Engine engine) {
        if(engine instanceof ElectricEngine){
            return "Verificando cabos de alta tensão ";
        }
        return "Tipo de engine não compativel com metrô";
    }

    @Override
    protected String checkBrakes(BrakeSystem brakes) {
        if(brakes instanceof ElectromagneticBrakes){
            return "Testando sistema eletromagnético";
        }
        return "Tipo de freio não compativel metrô";
    }

}
