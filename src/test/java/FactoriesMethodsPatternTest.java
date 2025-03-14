import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactoriesMethodsPatternTest {
    @Test
    public void testBikeMaintenanceFactoryCreatesCorrectComponents() {
        MaintenanceFactory factory = new BikeMaintenanceFactory();
        Engine engine = factory.createEngine();
        BrakeSystem brakes = factory.createBrakeSystem();
        assertTrue(engine instanceof PedalSystem, "Engine deve ser PedalSystem para bicicletas");
        assertTrue(brakes instanceof DiscBreakes, "Freios devem ser DiscBreakes para bicicletas");
    }

    @Test
    public void testBusMaintenanceFactoryCreatesCorrectComponents() {
        MaintenanceFactory factory = new BusMaintenanceFactory();
        Engine engine = factory.createEngine();
        BrakeSystem brakes = factory.createBrakeSystem();
        assertTrue(engine instanceof DieselEngine, "Engine deve ser DieselEngine para ônibus");
        assertTrue(brakes instanceof AirBrakes, "Freios devem ser AirBrakes para ônibus");
    }

    @Test
    public void testMetroMaintenanceFactoryCreatesCorrectComponents() {
        MaintenanceFactory factory = new MetroMaintenanceFactory();
        Engine engine = factory.createEngine();
        BrakeSystem brakes = factory.createBrakeSystem();
        assertTrue(engine instanceof ElectricEngine, "Engine deve ser ElectricEngine para metrô");
        assertTrue(brakes instanceof ElectromagneticBrakes, "Freios devem ser ElectromagneticBrakes para metrô");
    }

    @Test
    public void testVehicleFactoryCreatesVehicles() {
        MaintenanceFactory bikeFactory = new BikeMaintenanceFactory();
        MaintenanceFactory busFactory = new BusMaintenanceFactory();
        MaintenanceFactory metroFactory = new MetroMaintenanceFactory();

        VehicleType bike = VehicleFactory.createVehicle("Bike", "B006", bikeFactory);
        assertTrue(bike instanceof VehicleBike, "Deve criar um objeto do tipo VehicleBike");

        VehicleType bus = VehicleFactory.createVehicle("Bus", "BUS006", busFactory);
        assertTrue(bus instanceof VehicleBus, "Deve criar um objeto do tipo VehicleBus");

        VehicleType metro = VehicleFactory.createVehicle("Metro", "M004", metroFactory);
        assertTrue(metro instanceof VehicleMetro, "Deve criar um objeto do tipo VehicleMetro");
    }

    @Test
    public void testVehicleFactoryThrowsForInvalidType() {
        MaintenanceFactory factory = new BikeMaintenanceFactory();
        assertThrows(IllegalArgumentException.class, () -> {
            VehicleFactory.createVehicle("Car", "C001", factory);
        }, "Criar veículo com tipo inválido deve lançar IllegalArgumentException");
    }
}
