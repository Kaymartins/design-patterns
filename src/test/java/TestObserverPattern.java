

import static org.junit.jupiter.api.Assertions.*;

import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class TestObserverPattern {
    private FleetMonitor monitor;
    private AbstractVehicle vehicle;

    @BeforeEach
    void setUp() {
        monitor = FleetMonitor.getInstance();
        vehicle = (AbstractVehicle) VehicleFactory.createVehicle("Bike", "B001", new BikeMaintenanceFactory());
    }

    @Test
    void testStateChangeNotification() {
        vehicle.setState(new InMaintenanceState());
        assertTrue(monitor.getLogs().contains("InMaintenanceState"));
    }

    @Test
    void testMultipleNotifications() {
        vehicle.setState(new AvailableState());
        vehicle.setState(new UnavailableState());
        String logs = monitor.getLogs();
        assertTrue(logs.contains("AvailableState") && logs.contains("UnavailableState"));
    }
}
