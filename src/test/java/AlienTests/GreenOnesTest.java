package AlienTests;

import Aliens.GreenOnes;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreenOnesTest {
    GreenOnes greenOnes;
    @Before
    public void before() {
        greenOnes = new GreenOnes("GreenOnes", false);
    }
    @Test
    public void hasName(){
        assertEquals("GreenOnes", greenOnes.getName());
    }
//    @Test  Correct.  Failing test fails
//    public void hasNameFail(){
//        assertEquals("Henry", greenOnes.getName());
//    }
@Test
public void isFrienldly(){
    assertEquals(false, greenOnes.isFriendly());
}
//    @Test  Correct. This test should fail
//    public void isFrienldlyFails(){
//        assertEquals(truee, greenOnes.isFriendly());

}
