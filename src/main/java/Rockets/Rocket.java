package Rockets;

public abstract class Rocket {
    private  String rocketName;
    private  int  capacity;

    public Rocket(String rocketName, int capacity) {
        this.rocketName = rocketName;
        this.capacity = capacity;

    }
    public String getRocketName(){
        return this.rocketName;
    }
    public int getCapacity(){
        return this.capacity;
    }
    protected String fly(){
        return "Rocket Data Here";
    }

}