package control;

import java.util.Random;

/**
 * Created by qqq on 19.04.2016.
 */
public class VowelsAndConsonants {
    public static void main(String[] args) {
        Random rand = new Random(47);
        for (int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';
            System.out.printf("%c, %d ", ((char) c), c);
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("гласная");
                    break;
                case 'y':
                case 'w':
                    System.out.println("условно гласная");
                    break;
                default:
                    System.out.println("согласная");
            }
        }
    }
}
