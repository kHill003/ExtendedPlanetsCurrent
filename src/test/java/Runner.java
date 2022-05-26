import GameManager.MainGameManager;
//The purpsoe of this runner class is to quickly and easly print to console to
//check string names such as for the ships Captaon.  It is assigned to a random
//value so an assert equals test is not a good way to confirm varying output
public class Runner {
    public static void main(String[] args) {
        MainGameManager mainGameManager;
        mainGameManager =new MainGameManager();

        System.out.println(mainGameManager.outputCaptain());
        System.out.println(mainGameManager.outputCoPilot());
        System.out.println(mainGameManager.outputMedic());
        System.out.println(mainGameManager.outputShip());

    }
}

