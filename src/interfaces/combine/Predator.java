package interfaces.combine;

/**
 * Created by qqq on 02.05.2016.
 */
public interface Predator {
    void hunt();
    void eatMeat();
}

interface Herbivorous {
    void eatPlant();
}

interface Omnivorous extends Predator, Herbivorous {
    @Override
    default void eatPlant() {

    }

    @Override
    default void hunt() {

    }

    @Override
    default void eatMeat() {

    }
}