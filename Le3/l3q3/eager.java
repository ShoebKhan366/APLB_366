// Duck class using eager initialization
abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("Swimming");
    }

    abstract void display();
}

// Example of eager initialization in a specific duck
class RubberDuck extends Duck {
    public RubberDuck() {
        super(new NoFly(), new Squeak());  // Behaviors are assigned immediately
    }

    public void display() {
        System.out.println("I am a Rubber Duck");
    }
}
