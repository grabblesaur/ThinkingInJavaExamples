package interfaces.factories.throwThings;

import java.util.Random;

public class Cube implements GameObject {
    @Override
    public void roll() {
        System.out.println("Бросаем кубик:");
        Random random = new Random();
        System.out.println(random.nextInt(7));
    }
}
