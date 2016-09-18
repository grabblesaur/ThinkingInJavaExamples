package initialization.lessons;

/**
 * Created by qqq on 22.04.2016.
 */
public class Person {
    private String mName;
    private int mAge;

    public Person(String name, int age) {
        mName = name;
        mAge = age;
    }

    public Person() {
        this("Unknown Person", 0);
    }

    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.mName + " " + person.mAge);
    }
}

