package ManagerTests;

import Aliens.GreenOnes;
import GameManager.MainGameManager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainManagerTest {
    MainGameManager mainGameManager;

    @Before
    public void before() {
        mainGameManager = new MainGameManager();
    }

    @Test
    public void testRandomNumberkeOne() {
        int result = mainGameManager.getRandomNumber(4);
        boolean expected = result >= 0 && result < 4;
        assertEquals(true, expected);
    }
    public void testRandomNumberkeTwo() {
        int result = mainGameManager.getRandomNumber2(4);
        boolean expected = result >= 0 && result < 4;
        assertEquals(true, expected);
    }

}
