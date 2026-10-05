
package pt.upt.fleetcheck;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class FleetCheckTest {

    @Test
    void vehicleAtServiceIntervalNeedsService() {

        FleetService service = new FleetService();

        Vehicle vehicle = new Vehicle(
                "V1",
                "EV",
                50000,
                40000,
                10000
        );

        assertTrue(service.needsService(vehicle));
    }
}
