package RocketTests;

import Rockets.Apallo;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Apallotest {
    Apallo apallo;

    @Before
    public void before() {
        apallo = new Apallo("Apallo", 3, 500);
    }

    @Test
    public void hasName2() {
        assertEquals("Apallo", apallo.getName2());
    }

    @Test
    public void canGiveRocketMessage() {
        assertEquals("I am Apallo", apallo.fly());
    }
//    @Test Correct it fails
//    public void canGiveRocketMessageFail() {
//        assertEquals("I am a dog", apallo.fly());
//    }
}