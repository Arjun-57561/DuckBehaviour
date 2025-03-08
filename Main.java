
// Name: Bontha Mallikarjun Reddy
// PRN: 23070126026
// Batch: SY AIML A1

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck rubber = new RubberDuck();
        Duck redhead = new RedheadDuck();
        Duck decoy = new DecoyDuck();

        mallard.display();
        mallard.performFly();
        mallard.performSwim();

        rubber.display();
        rubber.performFly();
        rubber.performSwim();

        redhead.display();
        redhead.performFly();
        redhead.performSwim();

        decoy.display();
        decoy.performFly();
        decoy.performSwim();
    }
}