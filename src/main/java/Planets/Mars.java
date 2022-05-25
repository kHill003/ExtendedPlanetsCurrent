package Planets;

public class  Mars extends Planets {
    public Mars(String planetName, int planetSize, boolean isInhabited) {
        super(planetName, planetSize, isInhabited);

    }

    public String getName() {
        return getPlanetName();
    }
}