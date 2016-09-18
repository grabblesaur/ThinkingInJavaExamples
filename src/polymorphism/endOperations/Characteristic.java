package polymorphism.endOperations;

/**
 * Created by qqq on 29.04.2016.
 */
public class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        System.out.println("Создаем Charasteristic " + s);
    }

    protected void dispose() {
        System.out.println("Завершаем Charasteristic " + s);
    }
}
