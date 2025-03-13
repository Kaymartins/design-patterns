package org.example;

public class BusInspection extends SafetyInspection{

    @Override
    protected String checkEngine(Engine engine) {
        if(engine instanceof DieselEngine){
            return "Verificando vazamentos de óleo no motor ";
        }
        return "Tipo de motor não compativel com ônibus";
    }

    @Override
    protected String checkBrakes(BrakeSystem brakes) {
        if(brakes instanceof DieselEngine){
            return "Testando pressão dos freios a ar";
        }
        return "Tipo de freio não compativel com ônibus";
    }
}
