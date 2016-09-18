package concurrency.fourth_part.lesson;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/***
 *
 */

public class SleepingTaskDemo implements Runnable{

    private static int count = 0;
    private final int id = count++;

    @Override
    public void run() {
        Random r = new Random();
        int delay = r.nextInt(10);
        try {
            TimeUnit.SECONDS.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("#" + id + " delay time: " + delay +
                " seconds");
    }

    public static void main(String[] args) {

        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            exec.execute(new SleepingTaskDemo());
        }
        exec.shutdown();
    }
}
