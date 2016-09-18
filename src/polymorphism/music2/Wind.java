package polymorphism.music2;

import polymorphism.music.Note;

/**
 * Created by qqq on 28.04.2016.
 */
public class Wind extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Wind.play() " + n);
    }

    @Override
    String what() {
        return "Wind";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Wind");
    }
}
