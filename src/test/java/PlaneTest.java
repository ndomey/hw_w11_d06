import org.example.Plane;
import org.example.PlaneType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747 );
    }

    @Test
    public void hasPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void hasWeight(){
        assertEquals(124000, plane.getPlaneType().getWeight());
    }

    @Test
    public void hasCapacity(){
        assertEquals(467, plane.getPlaneType().getCapacity());
    }

}
