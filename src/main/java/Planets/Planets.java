package Planets;

public  abstract class Planets {
    private String planetName;
    private int planetSize;
    private boolean isInhabited;

    public Planets (String planetName, int planetSize, boolean isInhabited){
        this.planetName = planetName;
        this.planetSize = planetSize;
        this.isInhabited = true;

    }
    public String getPlanetName(){
        return this.planetName;
    }
    public int getPlanetSize(){
        return this.planetSize;
    }
    public boolean isInhabited(){
        return this.isInhabited;
    }
}

