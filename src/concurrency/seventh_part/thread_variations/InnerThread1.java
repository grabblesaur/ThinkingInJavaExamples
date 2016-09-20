package concurrency.seventh_part.thread_variations;

/**
 * Создание именованного внутреннего класса:
 */
public class InnerThread1 {
    private int countDown = 5;
    private Inner inner;

    public InnerThread1(Inner inner) {
        this.inner = inner;
    }

    private class Inner extends Thread {

        public Inner(String name) {
            super(name);
            start();
        }

        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println(this);
                    if (--countDown == 0) {
                        return;
                    }
                    sleep(10);
                }
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
        }

        @Override
        public String toString() {
            return getName() + ": " + countDown;
        }
    }
}
