import static org.junit.jupiter.api.Assertions.*;

import org.example.*;
import org.junit.jupiter.api.Test;

public class TestStatePattern {
    private AbstractVehicle vehicle;

    @Test
    public void testInitialStateIsAvailable() {
        MaintenanceFactory factory = new BikeMaintenanceFactory();
        VehicleType bike = new VehicleBike("B001", factory);
        assertTrue(bike.getState() instanceof AvailableState, "Estado inicial deve ser AvailableState");
    }

    @Test
    public void testAllocationChangesStateToUnavailable() {
        MaintenanceFactory factory = new BikeMaintenanceFactory();
        VehicleType bike = new VehicleBike("B002", factory);
        String allocationMessage = bike.allocate();
        assertEquals("B002 alocado.", allocationMessage);
        assertTrue(bike.getState() instanceof UnavailableState, "Após alocação, o estado deve ser UnavailableState");
    }

    @Test
    public void testReturnToBaseChangesStateToAvailable() {
        MaintenanceFactory factory = new BikeMaintenanceFactory();
        VehicleType bike = new VehicleBike("B003", factory);
        bike.allocate(); // muda para UnavailableState
        String returnMessage = bike.returnToBase();
        assertEquals("B003 retornou e está disponível.", returnMessage);
        assertTrue(bike.getState() instanceof AvailableState, "Após retorno, o estado deve ser AvailableState");
    }

    @Test
    public void testMaintenanceTransitions() {
        MaintenanceFactory factory = new BikeMaintenanceFactory();
        VehicleType bike = new VehicleBike("B004", factory);
        String maintenanceMessage = bike.startMaintenance();
        assertEquals("B004 enviado para manutenção.", maintenanceMessage);
        assertTrue(bike.getState() instanceof InMaintenanceState, "Durante manutenção, o estado deve ser InMaintenanceState");

        String finishMaintenanceMessage = bike.finishMaintenance();
        assertEquals("Manutenção concluída. B004 disponível.", finishMaintenanceMessage);
        assertTrue(bike.getState() instanceof AvailableState, "Após finalizar a manutenção, o estado deve voltar a AvailableState");
    }

    @Test
    public void testDeactivationState() {
        MaintenanceFactory factory = new BikeMaintenanceFactory();
        VehicleType bike = new VehicleBike("B005", factory);
        String deactivateMessage = bike.deactivate();
        assertEquals("B005 desativado permanentemente.", deactivateMessage);
        assertTrue(bike.getState() instanceof DeactivatedState, "Após desativar, o estado deve ser DeactivatedState");

        // Operações com veículo desativado devem estar bloqueadas
        String allocateMessage = bike.allocate();
        assertEquals("B005 desativado. Operação bloqueada.", allocateMessage);
    }
}
