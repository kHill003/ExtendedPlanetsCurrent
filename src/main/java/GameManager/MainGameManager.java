package GameManager;

import Astronaughts.Astronaughts;

import java.util.ArrayList;
import java.util.Random;

public class MainGameManager {

    Astronaughts an;
    private String CaptainName;

    private int RandomMax;

    public MainGameManager() {
        an = new Astronaughts();
        an.createHashMap();
    }

    public int getRandomNumber(int RandomMax) {
        Random rand = new Random();
        int outputNumber = rand.nextInt(RandomMax);
        return outputNumber;
    }

    public String outputCaptain() {
       int x = getRandomNumber(4);
        ArrayList returnedList = an.getValues("Key1");
        CaptainName = (String) returnedList.get(x);
        return CaptainName;

    }

}



