package polymorphism.Cycle;

public class CycleTest {

    public static void ride(Cycle c) {
        c.run();
    }

    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        ride(b);

        Cycle[] cycles = {
                new Cycle(),
                new Bicycle(),
                new Tricycle()
        };// end []

        ((Bicycle) cycles[1]).balance();
    }
}
