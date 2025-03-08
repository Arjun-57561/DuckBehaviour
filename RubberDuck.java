// RubberDuck.java
class RubberDuck extends Duck {
    RubberDuck() {
        flyBehavior = new NotFly();
        swimBehavior = new Float();
    }
    public void display() {
        System.out.println("I am a Rubber Duck.");
    }
}