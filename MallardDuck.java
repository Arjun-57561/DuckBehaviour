// MallardDuck.java
class MallardDuck extends Duck {
    MallardDuck() {
        flyBehavior = new Fly();
        swimBehavior = new Swim();
    }
    public void display() {
        System.out.println("I am a Mallard Duck.");
    }
}