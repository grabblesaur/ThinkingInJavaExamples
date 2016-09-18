package control.lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 1 1 2 3 5 8 13 21 34 ...
 * Created by qqq on 19.04.2016.
 */
public class step23 {

    public static void main(String[] args) {
        Fibonacci(10);
        Fibonacci(5);
    }

    public static void Fibonacci (int n) {
        List<Integer> fSeq = new ArrayList<>();
        fSeq.add(Integer.valueOf(1));
        fSeq.add(Integer.valueOf(1));
        for (int i = 2; i < n; i++) {
            fSeq.add(fSeq.get(i-1) + fSeq.get(i-2));
        }

        System.out.println(fSeq);
    }
}
