package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrototypePatternTest {

    @Test
    public void testCloneVehicle() throws CloneNotSupportedException {
        MaintenanceFactory factory = new BikeMaintenanceFactory();
        VehicleType original = new VehicleBike("B001", factory);
        AbstractVehicle originalVehicle = (AbstractVehicle) original;

        AbstractVehicle cloneVehicle = originalVehicle.clone();

        assertNotSame(originalVehicle, cloneVehicle, "O clone deve ser uma nova instância.");

        assertEquals(originalVehicle.getVehicleId(), cloneVehicle.getVehicleId(), "Os IDs iniciais devem ser iguais.");

        cloneVehicle.setVehicleId("B002");

        assertEquals("B002", cloneVehicle.getVehicleId(), "O ID do clone deve ser atualizado para B002.");
        assertEquals("B001", originalVehicle.getVehicleId(), "O ID do original deve permanecer B001.");
    }
}