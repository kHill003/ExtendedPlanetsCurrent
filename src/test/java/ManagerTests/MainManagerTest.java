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
    public void testRandomNumber() {
        int result = mainGameManager.getRandomNumber(5);
        boolean expected = result >= 0 && result < 5;
        assertEquals(true, expected);
    }

}
