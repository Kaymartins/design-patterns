import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SingletoonPatternTest {
    @Test
    public void testFleetMonitorIsSingleton() {
        FleetMonitor instance1 = FleetMonitor.getInstance();
        FleetMonitor instance2 = FleetMonitor.getInstance();
        assertSame(instance1, instance2, "FleetMonitor deve ser singleton, retornando a mesma instância.");
    }

    @Test
    public void testFleetMonitorLogAfterStateChange() {
        MaintenanceFactory factory = new BusMaintenanceFactory();
        VehicleType bus = new VehicleBus("BUS007", factory);

        String initialLog = FleetMonitor.getInstance().getLogs();
        bus.allocate();
        String updatedLog = FleetMonitor.getInstance().getLogs();
        assertTrue(updatedLog.length() > initialLog.length());
        assertTrue(updatedLog.contains("BUS007"), "O log deve conter o ID do veículo alterado.");
        assertTrue(updatedLog.contains("UnavailableState"), "O log deve indicar o nome do estado (UnavailableState).");
    }
}
