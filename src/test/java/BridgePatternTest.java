import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BridgePatternTest {
    @Test
    public void testBikeControllerOperate() {
        MaintenanceFactory factory = new BikeMaintenanceFactory();
        VehicleType bike = new VehicleBike("B010", factory);
        BikeController controller = new BikeController(bike);

        String result = controller.operate();
        assertEquals("Bicicleta B010: Em uso.", result,
                "BikeController deve iniciar a bicicleta e retornar a mensagem correta.");
    }

    @Test
    public void testBusControllerOperate() {
        MaintenanceFactory factory = new BusMaintenanceFactory();
        VehicleType bus = new VehicleBus("BUS010", factory);
        BusController controller = new BusController(bus);

        String result = controller.operate();
        assertEquals("Ônibus BUS010: Motor diesel ligado.", result,
                "BusController deve iniciar o ônibus e retornar a mensagem correta.");
    }

    @Test
    public void testMetroControllerOperate() {
        MaintenanceFactory factory = new MetroMaintenanceFactory();
        VehicleType metro = new VehicleMetro("M010", factory);
        MetroController controller = new MetroController(metro);

        String result = controller.operate();
        assertEquals("Metrô M010: Sistema elétrico ativado.", result,
                "MetroController deve iniciar o metrô e retornar a mensagem correta.");
    }
}
