package polymorphism.music2;

import polymorphism.music.Note;

/**
 * Created by qqq on 28.04.2016.
 */
public class Brass extends Wind {
    @Override
    void play(Note n) {
        System.out.println("Brass.play() " + n);
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Brass");
    }
}
