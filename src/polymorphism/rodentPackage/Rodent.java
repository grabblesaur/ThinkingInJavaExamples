package polymorphism.rodentPackage;

public class Rodent {
    public void run() {}
    public void eat() {}
    public void squeak() {}
}

class Mouse extends Rodent {
    @Override
    public void run() {
        System.out.println("Mouse.run()");
    }

    @Override
    public void eat() {
        System.out.println("Mouse.eat()");
    }

    @Override
    public void squeak() {
        System.out.println("Mouse.squeak()");
    }
}
class Hamster extends Rodent {
    @Override
    public void run() {
        System.out.println("Hamster.run()");
    }

    @Override
    public void eat() {
        System.out.println("Hamster.eat()");
    }

    @Override
    public void squeak() {
        System.out.println("Hamster.squeak()");
    }
}

