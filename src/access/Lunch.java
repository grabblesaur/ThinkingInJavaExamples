package access;

/**
 * Спецификаторы доступа для классов
 * Использование конструкторов, объявленных private,
 * делает класс недоступным при создании объектов.
 */
class Soup1 {
    private Soup1() {}
    // (1) Разрешаем создание объектов в статическом методе:
    public static Soup1 makeSoup() {
        return new Soup1();
    }
}

class Soup2 {
    private Soup2() {}
    // (2) Создаем один статический объект
    // и по требованию возвращаем ссылку на него.
    private static Soup2 ps1 = new Soup2();
    public static Soup2 access() {
        return ps1;
    }
    public void f() {}
}

public class Lunch {
    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.access().f();
    }
}
