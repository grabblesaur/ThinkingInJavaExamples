package polymorphism.refcounting;

/**
 * Created by qqq on 29.04.2016.
 */
public class Trash {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;

    public Trash() {
        System.out.println("Создаем " + this.toString());
    }

    public static void main(String[] args) {
        Trash t = new Trash();
    }

    @Override
    public String toString() {
        return "Trash " + id;
    }
}
