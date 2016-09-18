package concurrency.third_part.lesson;

import java.math.BigInteger;
import java.util.concurrent.Callable;

public class FibonacciCallableImpl implements Callable<String> {

    private static int count = 0;
    private final int id = count++;

    private int size;

    public FibonacciCallableImpl(int size) {
        this.size = size;
    }

    @Override
    public String call() throws Exception {
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;

        BigInteger currentDigit = BigInteger.ZERO;
        for (int i = 0; i < size; i++) {
            currentDigit = first.add(second);
            first = second;
            second = currentDigit;
        }

        return "#" + id + ": " + currentDigit;
    }
}
