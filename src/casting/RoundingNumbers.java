package casting;

/**
 * Created by qqq on 18.04.2016.
 */
public class RoundingNumbers {
    public static void main(String[] args) {
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        System.out.println(Math.round(above));
        System.out.println(Math.round(below));
        System.out.println(Math.round(fabove));
        System.out.println(Math.round(fbelow));
    }
}
/* Output
1
0
1
0
 */