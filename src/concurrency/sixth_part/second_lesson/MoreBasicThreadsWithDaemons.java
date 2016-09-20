package concurrency.sixth_part.second_lesson;

import concurrency.first_part.LiftOff;

import java.util.concurrent.TimeUnit;

/**
 * Измените пример MoreBasicThread.java так, чтобы все потоки
 * выполнялись в режиме демона. Убедитесь в том, что програма
 * завершается сразу же после выхода из main().
 */
public class MoreBasicThreadsWithDaemons {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new LiftOff());
            t.setDaemon(true);
            t.start();
        }
    }
}
