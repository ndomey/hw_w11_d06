import org.example.*;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;
    CabinCrewMember aircabincrew1;
    CabinCrewMember aircabincrew2;
    CabinCrewMember aircabincrew3;
    CabinCrewMember aircabincrew4;
    Pilot pilot1;
    Pilot pilot2;
    Flight flight;
    Plane plane;
    LocalTime departureTime;

    @Before
    public void before(){
        passenger = new Passenger("Chris P. Bacon", 1);
        plane = new Plane(PlaneType.DORNIER228);
        departureTime = LocalTime.of(11,00);
        flight = new Flight("LF123" ,"LHR","EDI", departureTime);
        flight.addPlane(plane);
        flight.addPassenger(passenger);
    }


    @Test
    public void hasName(){
        assertEquals("Chris P. Bacon", passenger.getName());
    }

    @Test
    public void hasBag(){
        assertEquals(1, passenger.getNumOfBags());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("LF123", passenger.getFlight());
    }
}
