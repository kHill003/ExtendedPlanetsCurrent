package Aliens;

public abstract class Aliens {
    private String alienName;
    private boolean isFriendly;

    public Aliens (String alienName, boolean isFriendly){
        this.alienName = alienName;
        this.isFriendly = false;
    }
    public String getAlienName(){
        return this.alienName;
    }
    public boolean isFriendly(){
        return this.isFriendly;
    }



}
