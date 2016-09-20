package concurrency.fifth_part;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimplePriorities implements Runnable {

    private int countDown = 5;
    private volatile double d; // без оптимизации
    private int priority;
    private String name;

    public SimplePriorities(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    @Override
    public String toString() {
        return Thread.currentThread() + ": " + countDown + ", name : " + name;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        while (true) {
            // Высокозатратная прерываемая операция:
            for (int i = 1; i < 10000000; i++) {
                d += (Math.PI + Math.E) / (double) i;
                if (i % 1000 == 0) {
                    Thread.yield();
                }
            }
            System.out.println(this);
            if (--countDown == 0) return;
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(
                    new SimplePriorities(Thread.MIN_PRIORITY, "min_priority"));
        }
        exec.execute(new SimplePriorities(Thread.MAX_PRIORITY, "max_priority"));
    }
}
















