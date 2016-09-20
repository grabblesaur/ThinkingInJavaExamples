package concurrency.sixth_part.third_lesson;

import concurrency.fifth_part.SimplePriorities;
import concurrency.sixth_part.SimpleDaemons;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/***
 * Измените пример SimplePriorities.java чтобы пользовательская
 * реализация ThreadFactory раздавала приоритеты потоков
 */
public class SimplePrioritiesWithFactories implements Runnable {

    private int countDown = 5;
    private volatile double d;

    @Override
    public String toString() {
        return Thread.currentThread() + ": " + countDown;
    }

    @Override
    public void run() {
        while(true) {
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
        ExecutorService serviceLow = Executors.newCachedThreadPool(new LowPriorityFactory());
        for (int i = 0; i < 10; i++) {
            serviceLow.execute(new SimplePrioritiesWithFactories());
        }
        serviceLow.shutdown();

        ExecutorService serviceHigh = Executors.newCachedThreadPool(new HighPriorityFactory());
        serviceHigh.execute(new SimplePrioritiesWithFactories());
        serviceHigh.shutdown();
    }
}

class LowPriorityFactory implements ThreadFactory {

    @Override
    public Thread newThread(@NotNull Runnable r) {
        Thread t = new Thread(r);
        t.setPriority(Thread.MIN_PRIORITY);
        return t;
    }
}

class HighPriorityFactory implements ThreadFactory {

    @Override
    public Thread newThread(@NotNull Runnable r) {
        Thread t = new Thread(r);
        t.setPriority(Thread.MAX_PRIORITY);
        return t;
    }
}
