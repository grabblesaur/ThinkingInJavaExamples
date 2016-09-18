package concurrency.second_part.second_lesson;

import concurrency.first_part.second_lesson.Fibbonnacci;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FibbonacciExecutors {

    public static void main(String[] args) {

        int size = 1000;

//        usingCachedThreadPool(size);
        usingFixedThreadPool(size);
//        usingSingleThreadPool(size);
    }

    private static void usingCachedThreadPool(int size) {
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            service.execute(new Fibbonnacci(size));
        }
        service.shutdown();
    }

    private static void usingFixedThreadPool(int size) {
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            service.execute(new Fibbonnacci(size));
        }
        service.shutdown();
    }

    private static void usingSingleThreadPool(int size) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 10; i++) {
            service.execute(new Fibbonnacci(size));
        }
        service.shutdown();
    }

}
