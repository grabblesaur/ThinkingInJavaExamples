package operators;

/**
 * Created by qqq on 31.03.2016.
 * "e" обозначает "10 в степени"
 */
public class Exponents {
    public static void main(String[] args) {
        //Прописная и строчная 'e' эквивалентны
        float expFloat = 1.39e-43f;
        expFloat = 1.39E-43f;
        System.out.println(expFloat);
        double expDouble = 47e47d; //Суффикс 'd' необязателен
        double expDouble2 = 47e47;
        System.out.println(expDouble2);

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
    }
}
