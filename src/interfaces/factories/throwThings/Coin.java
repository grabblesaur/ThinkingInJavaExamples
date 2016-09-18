package interfaces.factories.throwThings;

import java.util.Random;

public class Coin implements GameObject {
    @Override
    public void roll() {
        System.out.println("Бросаем монетку:");
        Random random = new Random();
        if (random.nextInt(2) == 0) {
            System.out.println("Орел");
        } else {
            System.out.println("Решка");
        }
    }
}
