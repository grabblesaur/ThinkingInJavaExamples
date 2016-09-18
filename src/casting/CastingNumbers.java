package casting;

/**
 * Created by qqq on 18.04.2016.
 * Что происходит при приведении типов
 * float или double к целочисленным значениям?
 */
public class CastingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.printf("(int)above: %d%n", ((int) above));
        System.out.printf("(int)below: %d%n", ((int) below));
        System.out.printf("(int)fabove: %d%n", ((int) fabove));
        System.out.printf("(int)fbelow: %d%n", ((int) fbelow));
    }
}
/* Output
(int)above: 0
(int)below: 0
(int)fabove: 0
(int)fbelow: 0
 */