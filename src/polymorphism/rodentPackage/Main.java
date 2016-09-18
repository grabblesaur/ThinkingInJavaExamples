package polymorphism.rodentPackage;

/**
 * Created by qqq on 28.04.2016.
 */
public class Main {
    private static RodentGenerator rg = new RodentGenerator();
    public static void main(String[] args) {
        Rodent[] r = new Rodent[10];
        for (int i = 0; i < r.length; i++)
            r[i] = rg.generateRandomRodent();

        for (Rodent rodent : r) {
            rodent.run();
        }
    }
}
