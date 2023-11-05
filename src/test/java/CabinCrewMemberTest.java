import org.example.CabinCrewMember;
import org.example.RankType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Al Bino", RankType.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasName(){
        assertEquals("Al Bino", cabinCrewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(RankType.FLIGHT_ATTENDANT, cabinCrewMember.getRankType());
    }

    @Test
    public void canGiveAnnouncement(){
        assertEquals("Ladies and gentlemen, the Captain has turned on the fasten seat belt sign. " +
                "We are now crossing a zone of turbulence." +
                "Please return your seats and keep your seat belts fastened. Thank you.",
                cabinCrewMember.inflightPassengerAnnouncement());
    }
}
