package interfaces.factories.developers;

import interfaces.factories.developers.Developer;

/**
 * Created by qqq on 03.05.2016.
 */
public class JavaDeveloper implements Developer {
    @Override
    public void write() {
        System.out.println("Java developer writes Java code");
    }
}
