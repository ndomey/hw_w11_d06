import org.example.*;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    CabinCrewMember aircabincrew1;
    CabinCrewMember aircabincrew2;
    CabinCrewMember aircabincrew3;
    CabinCrewMember aircabincrew4;
    Pilot pilot1;
    Pilot pilot2;
    Flight flight;
    Plane plane;
    Passenger passenger;
    LocalTime departureTime;

    @Before
    public void before(){
        passenger = new Passenger("Chris P. Bacon", 1);
        aircabincrew1 = new CabinCrewMember("Anna Conda", RankType.FLIGHT_ATTENDANT);
        aircabincrew2 = new CabinCrewMember("Bud Wieser", RankType.FLIGHT_ATTENDANT);
        aircabincrew3 = new CabinCrewMember("Crystal Claire Waters", RankType.FLIGHT_ATTENDANT);
        aircabincrew4 = new CabinCrewMember("Holly Day", RankType.FLIGHT_ATTENDANT);
        pilot1 = new Pilot("Amelia Earhart", RankType.CAPTAIN, "AA123456");
        pilot2 = new Pilot("Erich Hartmann", RankType.FIRST_OFFICER, "BB123456");
        plane = new Plane(PlaneType.DORNIER228);
        departureTime = LocalTime.of(11,00);
        flight = new Flight("LF123" ,"LHR","EDI", departureTime);
        flight.addPlane(plane);
        flight.addPilot(pilot1);
        flight.addPilot(pilot2);
        flight.addCabinCrewMember(aircabincrew1);
        flight.addCabinCrewMember(aircabincrew2);
        flight.addCabinCrewMember(aircabincrew3);
        flight.addCabinCrewMember(aircabincrew4);
    }

    @Test
    public void hasPlane(){

        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void hasDestination(){

        assertEquals("LHR", flight.getDestination());
    }@Test
    public void hasDepartureAirport(){

        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){

        assertEquals(LocalTime.of(11, 00), flight.getDepartureTime());
    }

    @Test
    public void canAddPassenger(){
        assertEquals("Passenger added successfully.", flight.addPassenger(passenger));
    }

//    @Test
//    public void cannotAddPassenger(){                                             // to test, plane type capacity must be changed
//        assertEquals("Sorry, this flight is full.", flight.addPassenger(passenger));
//    }

    @Test
    public void hasAvailableSeats(){
        assertEquals(19, flight.availableSeats());
    }

    @Test
    public void isThereEnoughCrewOnBoard(){
        assertEquals(true, flight.teamOnBoard());
    }
}
