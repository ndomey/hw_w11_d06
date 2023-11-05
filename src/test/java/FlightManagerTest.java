import org.example.*;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    FlightManager flightManager;
    Flight flight;
    Plane plane;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    LocalTime departureTime;

    @Before
    public void before(){
        plane = new Plane(PlaneType.DORNIER228);
        flight = new Flight("LF123", "LHR","EDI", departureTime);
        flight.addPlane(plane);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger3);
        flight.addPassenger(passenger4);
        flightManager =  new FlightManager(flight);
    }

    @Test
    public void canCalculateBaggageWeightAllowance() {
        assertEquals(52.00, flightManager.baggageWeightAllowance(), 0.01);
    }

    @Test
    public void canCalculatePassengersBaggageWeight() {
        assertEquals(208.00, flightManager.passengersBaggageWeight(), 0.01);
    }

    @Test
    public void canCalculateRemainingCargoCapacity() {
        assertEquals(792.00, flightManager.remainingCargoCapacity(), 0.01);
    }
}



