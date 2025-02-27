abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public FlyBehavior getFlyBehavior() {
        if (flyBehavior == null) {  // Lazy initialization
            flyBehavior = defaultFlyBehavior();
        }
        return flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        if (quackBehavior == null) {  // Lazy initialization
            quackBehavior = defaultQuackBehavior();
        }
        return quackBehavior;
    }

    public void performFly() {
        getFlyBehavior().fly();
    }

    public void performQuack() {
        getQuackBehavior().quack();
    }

    public void swim() {
        System.out.println("Swimming");
    }

    abstract FlyBehavior defaultFlyBehavior();
    abstract QuackBehavior defaultQuackBehavior();
    abstract void display();
}

class RubberDuck extends Duck {
    public void display() {
        System.out.println("I am a Rubber Duck");
    }

    @Override
    FlyBehavior defaultFlyBehavior() {
        return new NoFly();  // Only instantiated when needed
    }

    @Override
    QuackBehavior defaultQuackBehavior() {
        return new Squeak();  // Only instantiated when needed
    }
}
