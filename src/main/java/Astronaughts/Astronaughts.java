package Astronaughts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ArrayList;
//I got stuck writing this class as it needed to pass an array list to a hashmap.  I checked Stack overflow, and
//was still stuck so I ASKED FOR HELP!  Keith came and worked with me to get a basic implementatin working.
//The current issue is that it only reads key1.  I have tried other methods.  They version
//I am implementing is not the best answer.  I am condident there are better ways but I have
//spent today in a rabbit hole so am moving on wth a working but clunlu veropm involving
//more than one array- kind of defeats the purpose.  Will fix later if time
public class Astronaughts {

    private ArrayList<String> myValues;
    private ArrayList<String> myValues2;
    private ArrayList<String> myValues3;
    private HashMap hm;

    public Astronaughts() {
        this.myValues = new ArrayList<>();
        this.myValues2 = new ArrayList<>();
        this.myValues3 = new ArrayList<>();

        this.hm = new HashMap<>();
    }

    public void createHashMap() {
        hm = new HashMap<>();
        myValues = new ArrayList<>();//This list is the array list of the ship Captians
        myValues.add("Tony");
        myValues.add("Keith");
        myValues.add("Estrid");
        myValues.add("Jon");
        hm.put("key1", myValues);
        myValues2.add("Kris");//This is the list of co-polites
        myValues2.add("Meera");
        myValues2.add("Ash");
        myValues2.add("Ajib");
        hm.put("key2", myValues2);
        myValues3.add("Morag");//This is the list of medics
        myValues3.add("Ellie");
        myValues3.add("Tok");
        myValues3.add("James");
        hm.put("key3", myValues3);


    }

    public ArrayList getValues(String key) {
        return (ArrayList) hm.get("key1");
    }

    public ArrayList getValues2(String key) {
        return (ArrayList) hm.get("key2");
    }
    public ArrayList getValues3(String key) {
        return (ArrayList) hm.get("key3");
    }
}



