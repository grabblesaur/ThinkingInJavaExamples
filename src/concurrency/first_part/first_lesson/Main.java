package concurrency.first_part.first_lesson;

import java.util.*;

/**
 * Пример с использованием семи потоков, где каждый поток представляет из себя имя гонщика.
 * Является наглядным примером работы потоков.
 *
 * Задание: Реализуйте интерфейс Runnable. В методе run() выведите
 * сообщние, после чего вызовите yeild(). Создайте несколько задач
 * и организуйте их выполнение с использованием потоков.
 */

public class Main {
    public static void main(String[] args) {
        String[] racers = {"Petrov", "Raikkonen", "Hamilton", "Button", "Trulli", "Rosberg", "Alonso"};
//        Set<String> racerSet = new HashSet<>();
//        for (String item : racers) {
//            racerSet.add(item);
//        }

        List<String> racerCollection = Arrays.asList(racers);

        for (String item : racerCollection) {
            Thread t = new Thread(new Racer(item));
            t.start();
        }
    }
}
