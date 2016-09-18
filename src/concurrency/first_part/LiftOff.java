package concurrency.first_part;

public class LiftOff implements Runnable{

    private static int count = 0;
    private final int id = count++;

    protected int countDown = 10; // by default

    public LiftOff() {
    }

    public LiftOff(int countDown) {
        this.countDown = countDown;
    }

    protected String getStatus() {
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "Liftoff!") + ")";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(getStatus());
            Thread.yield();
        }
    }
}
