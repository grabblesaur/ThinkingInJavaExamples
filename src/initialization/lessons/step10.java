package initialization.lessons;

/**
 * Created by qqq on 23.04.2016.
 */
class Tank {
    boolean empty = false;

    public Tank(boolean isEmpty) {
        empty = isEmpty;
    }

    public void finalize() {
        if (empty)
            System.out.println("start finalizing objects");
    }
}

public class step10 {
    public static void main(String[] args) {
        Tank t = new Tank(true);
        new Tank(true);
        System.gc();
    }
}
