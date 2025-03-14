import org.example.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemplateMethodPatternTest {
    @Test
    public void testBikeInspectionReport() {
        MaintenanceFactory factory = new BikeMaintenanceFactory();
        VehicleType bike = new VehicleBike("B009", factory);
        SafetyInspection inspection = new BikeInspection();
        String report = inspection.performCheck(bike);
        assertTrue(report.contains("Verificando correntes e pedal"), "BikeInspection deve verificar o sistema de pedal");
        assertTrue(report.contains("Testando freios a disco"), "BikeInspection deve verificar os freios a disco");
        assertTrue(report.contains("Relatório gerado"), "O relatório deve conter a mensagem 'Relatório gerado'");
    }

    @Test
    public void testBusInspectionReport() {
        MaintenanceFactory factory = new BusMaintenanceFactory();
        VehicleType bus = new VehicleBus("BUS008", factory);
        SafetyInspection inspection = new BusInspection();
        String report = inspection.performCheck(bus);
        assertTrue(report.contains("Verificando vazamentos de óleo no motor"), "BusInspection deve verificar o motor diesel");
        assertTrue(report.contains("Tipo de freio não compativel com ônibus"), "BusInspection deve identificar freios incompatíveis");
    }

    @Test
    public void testMetroInspectionReport() {
        MaintenanceFactory factory = new MetroMaintenanceFactory();
        VehicleType metro = new VehicleMetro("M005", factory);
        SafetyInspection inspection = new MetroInspection();
        String report = inspection.performCheck(metro);
        assertTrue(report.contains("Verificando cabos de alta tensão"), "MetroInspection deve verificar os cabos de alta tensão");
        assertTrue(report.contains("Testando sistema eletromagnético"), "MetroInspection deve testar os freios eletromagnéticos");
    }

}
