package concurrency.first_part.second_lesson;

/***
 * Создайте задачу, которая генерирует последовательность из n
 * чисел Фиббоначчи.
 * Создайте несколько таких задач и выполните их в потоках
 */

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(new Fibbonnacci(1000));
            t.start();
        }
    }
}
