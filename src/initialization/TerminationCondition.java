package initialization;

/**
 * Created by qqq on 23.04.2016.
 * Использование finalize() для выявления объекта,
 * не осуществившего необходимой финализации.
 */
class Book {
    boolean checkedOut = false;
    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    public void finalize() throws Throwable {
        if(checkedOut)
            System.out.println("Error: checkedOut");
//        Обычно это делается так:
//        super.finalize(); // Вызов версии базового класса
    }
}


public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // Правильная очистка
        novel.checkIn();
        // Теряем ссылку, забыли про очистку:
        new Book(true);
        // Принудительная уборка мусора и финализация:
        System.gc();
    }
}
