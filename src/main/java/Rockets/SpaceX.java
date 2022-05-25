package Rockets;
public class SpaceX extends Rocket implements IFly{
    public SpaceX(String rocketName, int capacity) {
        super(rocketName, capacity);

    }

    public String getName() {
        return getRocketName();
    }
    public String fly() {
        return "I am Space X";
    }
}
