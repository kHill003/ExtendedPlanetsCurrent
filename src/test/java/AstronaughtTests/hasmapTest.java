package AstronaughtTests;

import Astronaughts.Astronaughts;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class hasmapTest {

    Astronaughts an;

    @Before
    public void before(){
        an = new Astronaughts();
        an.createHashMap();
    }

    @Test
    public void testCanGetValuesKeyOne(){
      // ArrayList returnedList = an.getValues("Key1");
    // assertEquals(returnedList.get(0), "Value 1");
    assertEquals(Arrays.asList("Tony", "Keith"), an.getValues("K1"));

    }
  //  @Test
   // Testpublic void testCanGetValuesKeyTwo(){
        //ArrayList returnedList = an.getValues("Key1");
        //assertEquals(returnedList.get(0), "Value 1");
      //  assertEquals(Arrays.asList("Meera", "Esgrid"), an.getValues2("Key2"));

    }


