package PlanetTests;

import Planets.Mars;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class MarsTest {
    Mars mars;

    @Before
    public void before() {
        mars = new Mars("Mars", 10000, true);

    }
    @Test
    public void hasName(){
        assertEquals("Mars", mars.getName());
    }
//    @Test I wrote a test that did fail.  I did it on purpose to prove that the method works
//    public void hasNameWillFail(){
//        assertEquals("Jupiter", mars.getName());
//    }
//Again, a fail test to prove it works
//@Test
//public void hasSizeFail(){
//    assertEquals(80, mars.getPlanetSize());}
//}
@Test
public void hasSize(){
    assertEquals(10000, mars.getPlanetSize());
}

    @Test
    public void isInhabited(){
        assertEquals(true, mars.isInhabited());
    }
//    @Test  To tsst it will fail if incorrect. Yes, it fails
//    public void isInhabiteFaild(){
//        assertEquals(false, mars.isInhabited());
//    }
}
