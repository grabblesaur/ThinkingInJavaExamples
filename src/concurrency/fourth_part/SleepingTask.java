package concurrency.fourth_part;

import concurrency.first_part.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/***
 * Вызов sleep() для приостановки выполнения.
 */

public class SleepingTask extends LiftOff {

    @Override
    public void run() {
        while (countDown -- > 0) {
            System.out.println(getStatus());
            // В старом стиле:
            // Thread.sleep(100);
            // В стиле Java SE5/6;
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                System.err.println("Interrupted");
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new SleepingTask());
        }
        exec.shutdown();
    }
}
