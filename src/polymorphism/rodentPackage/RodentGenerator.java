package polymorphism.rodentPackage;

import java.util.Random;

/**
 * Created by qqq on 28.04.2016.
 */
public class RodentGenerator {
    private Random mRandom = new Random(47);

    public Rodent generateRandomRodent() {
        switch (mRandom.nextInt(2)) {
            default:
            case 0: return new Mouse();
            case 1: return new Hamster();
        }
    }
}
