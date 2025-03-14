import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DecoratorPatternTest {
    @Test
    public void testGPSDecoratorAddsMessageOnStartEngine() {
        MaintenanceFactory factory = new BikeMaintenanceFactory();
        VehicleType bike = new VehicleBike("B007", factory);
        VehicleType bikeWithGPS = new GPS(bike);
        String startMessage = bikeWithGPS.startEngine();
        assertTrue(startMessage.contains("GPS ativado para B007"), "O decorator GPS deve adicionar a mensagem de ativação");
    }

    @Test
    public void testSecuritySystemDecoratorAddsMessageOnStopEngine() {
        MaintenanceFactory factory = new BikeMaintenanceFactory();
        VehicleType bike = new VehicleBike("B008", factory);
        VehicleType bikeWithSecurity = new SecuritySystem(bike);
        String stopMessage = bikeWithSecurity.stopEngine();
        assertTrue(stopMessage.contains("Sistema de segurança ativado."), "O decorator SecuritySystem deve adicionar a mensagem de segurança");
    }
}
