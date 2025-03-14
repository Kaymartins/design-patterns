package org.example;

public class VehicleFactory {
    public static VehicleType createVehicle(String type, String id, MaintenanceFactory factory){
        Class<?> clazz = null;
        Object obj = null;

        try{
            clazz = Class.forName("org.example.Vehicle" + type);
            obj = clazz.getConstructor(String.class, MaintenanceFactory.class).newInstance(id, factory);
        }catch(Exception e){
            throw new IllegalArgumentException("Veiculo Inexistente");
        }

        if(!(obj instanceof VehicleType)){
            throw new IllegalArgumentException("Veiculo inválido");
        }
        return (VehicleType) obj;
    }
}
