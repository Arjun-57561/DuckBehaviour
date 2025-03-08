class RedheadDuck extends Duck {
    RedheadDuck() {
        flyBehavior = new Fly();
        swimBehavior = new Swim();
    }
    public void display() {
        System.out.println("I am a Redhead Duck.");
    }
}