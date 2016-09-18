package interfaces.factories.developers;

import interfaces.factories.developers.Developer;

/**
 * Created by qqq on 03.05.2016.
 */
public class PhpDeveloper implements Developer {
    @Override
    public void write() {
        System.out.println("Php developer writes php code");
    }
}
