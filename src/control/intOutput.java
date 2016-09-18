package control;

/**
 * Created by qqq on 31.03.2016.
 */
public class intOutput {
    public static void main(String[] args) {
        randomInt();
    }

    public static void randomInt () {
        for (int i = 1; i <= 10000; i++) {
            int a = (int) (Math.random() * 100);
            int b = (int) (Math.random() * 100);
            if (a == b) {
                System.out.println("TADAAAAAH!");
                System.out.printf("%d = %d%n", a, b);
            }
        }
    }
}
