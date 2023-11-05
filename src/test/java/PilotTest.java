import org.example.*;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalTime;

import static org.junit.Assert.assertEquals;

public class PilotTest {
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
        aircabincrew1 = new CabinCrewMember("Al Bino", RankType.FLIGHT_ATTENDANT);
        aircabincrew2 = new CabinCrewMember("Bill Ding", RankType.FLIGHT_ATTENDANT);
        aircabincrew3 = new CabinCrewMember("Lucy Fer", RankType.FLIGHT_ATTENDANT);
        aircabincrew4 = new CabinCrewMember("Walter Melon", RankType.FLIGHT_ATTENDANT);
        pilot1 = new Pilot("Amelia Earhart", RankType.CAPTAIN, "AA123456");
        pilot2 = new Pilot("Erich Hartmann", RankType.FIRST_OFFICER, "AA123456");
        plane = new Plane(PlaneType.DORNIER228);
        flight = new Flight("LF123", "LHR","EDI", departureTime);
        flight.addPlane(plane);
        flight.addPilot(pilot1);
        flight.addPilot(pilot2);
        flight.addCabinCrewMember(aircabincrew1);
        flight.addCabinCrewMember(aircabincrew2);
        flight.addCabinCrewMember(aircabincrew3);
        flight.addCabinCrewMember(aircabincrew4);
    }

    @Test
    public void hasName(){
        assertEquals("Amelia Earhart", pilot1.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(RankType.CAPTAIN, pilot1.getRankType());
    }

    @Test
    public void hasPilotLicenceNumber(){
        assertEquals("AA123456", pilot1.getPilotLicenceNumber());
    }

    @Test
    public void canTakeOff(){
        assertEquals("Prepare for taking off!", pilot1.takeOff(flight));
    }

//    @Test public void cannotTakeOff(){                                                   //For this test, one of the crew member must be removed
//        assertEquals("Attention! Cannot take off without the required crew members!",
//                pilot1.takeOff(flight) );}
}
