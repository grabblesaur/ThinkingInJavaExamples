package polymorphism.music2;

import polymorphism.music.Note;

/**
 * Created by qqq on 28.04.2016.
 */
public class Stringed extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Stringed.play() " + n);
    }

    @Override
    String what() {
        return "Stringed";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Stringed");
    }
}
