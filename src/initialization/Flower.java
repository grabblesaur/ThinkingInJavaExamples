package initialization;

/**
 * Created by qqq on 22.04.2016.
 */
public class Flower {
    private int mPetalCount = 0;
    private String s = "initial value";

    public Flower(int petals) {
        mPetalCount = petals;
        System.out.println("Constructor with parameter int, petalCount = "
                            + mPetalCount);
    }

    public Flower(String inputString) {
        s = inputString;
        System.out.println("Constructor with parameter String, s = "
                + s);
    }

    public Flower(String inputString, int petals) {
        this(petals); // calling another constructor must be first and unique
        this.s = inputString;
        System.out.println("Arguments String and int");
    }

    public Flower() {
        this("Hi", 47);
        System.out.println("Default constructor (without arguments)");
    }

    void printPetalCount() {
        System.out.println("mPetalCount = " + mPetalCount);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }

}
