package Rockets;

public abstract class Rocket {
    private  String rocketName;
    private  int  capacity;
   private int  fuelAvailable;

    public Rocket(String rocketName, int capacity, int fuelAvailable) {
        this.rocketName = rocketName;
        this.capacity = capacity;
        this.fuelAvailable = fuelAvailable;


    }
    public String getRocketName(){
        return this.rocketName;
    }
    public int getCapacity(){
        return capacity;
    }
    public int getFuelAvailable(){
        return fuelAvailable;
    }
    protected String fly(){
        return "Rocket Data Here";
    }

}