package concurrency.second_part.first_lesson;

import concurrency.first_part.first_lesson.Racer;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Повторите упражнение first_part.first_lesson, но с разными типами Executor
 */
public class RacerExecutors {

    public static void main(String[] args) {

        String[] racerArray = {"Petrov", "Raikkonen", "Hamilton", "Button", "Trulli", "Rosberg", "Alonso"};
        List<String> racerList = Arrays.asList(racerArray);

//        usingCachedThreadPool(racerList);
//        usingFixedThreadPool(racerList);
        usingSingleThreadPool(racerList);
    }

    private static void usingCachedThreadPool(List<String> racerList) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (String name : racerList) {
            executorService.execute(new Racer(name));
        }
        executorService.shutdown();
    }

    private static void usingFixedThreadPool(List<String> racerList) {
        ExecutorService executorService = Executors.newFixedThreadPool(racerList.size());
        for (String name : racerList) {
            executorService.execute(new Racer(name));
        }
        executorService.shutdown();
    }

    private static void usingSingleThreadPool(List<String> racerList) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (String name : racerList) {
            executorService.execute(new Racer(name));
        }
        executorService.shutdown();
    }


}
