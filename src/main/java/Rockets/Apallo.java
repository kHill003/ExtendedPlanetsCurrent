package Rockets;

public class Apallo extends Rocket implements IFly{
    public Apallo(String rocketName, int capacity, int fuelAvailable ){
        super(rocketName, capacity, fuelAvailable);
    }

    public String getName2() {
        return getRocketName();
    }


    public String fly() {
        return "I am Apallo";
    }
}
