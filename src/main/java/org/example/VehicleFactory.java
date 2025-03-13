package org.example;

public class VehicleFactory {
    public static VehicleType createVehicle(String type, String id){
        Class<?> clazz = null;
        Object obj = null;

        try{
            clazz = Class.forName("org.example.Vehicle" + type);
            obj = clazz.getConstructor(String.class).newInstance(id);
        }catch(Exception e){
            throw new IllegalArgumentException("Veiculo Inexistente");
        }

        if(!(obj instanceof VehicleType)){
            throw new IllegalArgumentException("Veiculo inválido");
        }

        return (VehicleType) obj;
    }
}
