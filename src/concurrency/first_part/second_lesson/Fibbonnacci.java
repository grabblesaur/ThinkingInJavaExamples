package concurrency.first_part.second_lesson;

import java.math.BigInteger;

public class Fibbonnacci implements Runnable{

    private static int count = 0;
    private final int id = count++;

    private int size;

    public Fibbonnacci(int size) {
        this.size = size;
    }

    @Override
    public void run() {
        System.out.println("Thread with id #" + id + " was started");

        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;

        BigInteger currentElement = BigInteger.ZERO;

        for (int i = 0; i < size; i++) {
            currentElement = first.add(second);
            first = second;
            second = currentElement;
        }

        System.out.println("Thread with id #" + id + " was ended with value: " + currentElement);
        Thread.yield();
    }
}
