package AstronaughtTests;

import Astronaughts.AstronaughtsAndAllHashMaps;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class hasmapTest {

    AstronaughtsAndAllHashMaps an;

    @Before
    public void before(){
        an = new AstronaughtsAndAllHashMaps();
        an.createHashMap();
    }

    @Test
    public void testCanGetValuesKeyOne(){
    assertEquals(Arrays.asList("Tony", "Keith","Estrid", "Jon", "Ellie"), an.getValues("K1"));
    }
    @Test
    public void canGetValueAtIndex(){
         ArrayList returnedList = an.getValues("Key1");
        assertEquals(returnedList.get(0), "Tony");
    }
  //  @Test
   // Testpublic void testCanGetValuesKeyTwo(){
        //ArrayList returnedList = an.getValues("Key1");
        //assertEquals(returnedList.get(0), "Value 1");
      //  assertEquals(Arrays.asList("Meera", "Esgrid"), an.getValues2("Key2"));

    }


