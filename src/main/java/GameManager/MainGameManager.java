package GameManager;

import Astronaughts.AstronaughtsAndAllHashMaps;


import java.util.ArrayList;
import java.util.Random;

public class MainGameManager {

    AstronaughtsAndAllHashMaps an;
  //  RocketsHashMap rsm;
    private String CaptainName;
    private String copilotName;
    private String  medicName;

    private String  shipName;

    private int RandomMax;

    public MainGameManager() {
        an = new AstronaughtsAndAllHashMaps();

        an.createHashMap();


    }

    public int getRandomNumber(int RandomMax) {
        Random rand = new Random();
        int outputNumber = rand.nextInt(RandomMax);
        return outputNumber;
    }
    public int getRandomNumber2(int RandomMax) {
        Random rand = new Random();
        int outputNumber = rand.nextInt(RandomMax);
        return outputNumber;
    }
    public int getRandomNumber3(int RandomMax) {
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
    public String outputCoPilot() {
        int x = getRandomNumber3(4);
        ArrayList returnedList = an.getValues2("Key2");
        medicName= (String) returnedList.get(x);
        return medicName;

    }
    public String outputMedic() {
        int x = getRandomNumber3(4);
        ArrayList returnedList = an.getValues3("Key3");
        copilotName = (String) returnedList.get(x);
        return copilotName;

    }

    public String outputShip() {
        int x = getRandomNumber3(2);
        ArrayList returnedList = an.getValues4("Key4");
        shipName = (String) returnedList.get(x);
        return shipName;

    }

}



