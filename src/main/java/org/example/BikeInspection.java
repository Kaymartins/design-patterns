package org.example;

public class BikeInspection extends SafetyInspection {

    @Override
    protected String checkEngine(Engine engine) {
        if(engine instanceof PedalSystem){
            return "Verificando correntes e pedal";
        }
        return "Tipo de engine não compativel com as bicicletas";
    }

    @Override
    protected String checkBrakes(BrakeSystem brakes) {
        if(brakes instanceof DiscBreakes){
            return "Testando freios a disco";
        }
        return "Tipo de freio não compativel com as bicicletas";
    }
}
