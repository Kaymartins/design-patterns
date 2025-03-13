package org.example;

public class ElectricEngine implements Engine{
    @Override
    public String check() {
        return "Verificando tensão do motor elétrico";
    }
}
