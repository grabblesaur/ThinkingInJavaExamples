package polymorphism.endOperations;

/**
 * Created by qqq on 29.04.2016.
 */
public class Description {
    private String s;

    public Description(String s) {
        this.s = s;
        System.out.println("Создаем Description " + s);
    }

    protected void dispose() {
        System.out.println("Завершаем Description " + s);
    }
}
