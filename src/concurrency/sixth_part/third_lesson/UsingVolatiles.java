package concurrency.sixth_part.third_lesson;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Пример работы с "volatile"-переменными.
 * ТАК И НЕ РАЗОБРАЛСЯ
 */
public class UsingVolatiles implements Runnable {

    private int number;
    private volatile int sum;

    public UsingVolatiles(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        sum += number;
        System.out.println(sum);
        Thread.yield();
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            exec.execute(new UsingVolatiles(i));
        }
        exec.shutdown();
    }
}
