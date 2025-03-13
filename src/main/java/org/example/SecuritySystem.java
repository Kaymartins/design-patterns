package org.example;

public class SecuritySystem extends VehicleDecorator{
    public SecuritySystem(VehicleType vehicle) {
        super(vehicle);
    }

    @Override
    public String stopEngine() {
        return super.stopEngine() + "\n Sistema de segurança ativado.";
    }
}
