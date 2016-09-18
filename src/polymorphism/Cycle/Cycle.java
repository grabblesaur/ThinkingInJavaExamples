package polymorphism.Cycle;

public class Cycle {
    public void run() {
        System.out.println("Cycle.run()");
    }
}

class Bicycle extends Cycle {
    @Override
    public void run() {
        System.out.println("Bicycle.run()");
    }

    public void balance() {
        System.out.println("Bicycle.balance()");
    }
}

class Tricycle extends Cycle {
    @Override
    public void run() {
        System.out.println("Tricycle.run()");
    }
}