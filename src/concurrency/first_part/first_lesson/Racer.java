package concurrency.first_part.first_lesson;

public class Racer implements Runnable {

    private static int count = 1;
    private final int id = count++;

    private String name;
    private String startingNumber = "Starting number #" + id;

    public Racer(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(startingNumber + " " + name);
        Thread.yield();
    }
}
