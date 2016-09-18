package concurrency.third_part.lesson;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FibonacciCallableDemo {

    public static void main(String[] args) {

        ExecutorService service = Executors.newCachedThreadPool();
        List<Future<String>> results = new ArrayList<>();

        for(int i = 0; i < 5; i++) {
            results.add(service.submit(new FibonacciCallableImpl(100)));
        }

        for (Future<String> fs : results) {
            try {
                System.out.println(fs.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

}
