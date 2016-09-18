package polymorphism.music2;

import polymorphism.music.Note;

/**
 * Created by qqq on 28.04.2016.
 */
public class Percussion extends Instrument {
    @Override
    void play(Note n) {
        System.out.println("Percussion.play() " + n);
    }

    @Override
    String what() {
        return "Percussion";
    }

    @Override
    void adjust() {
        System.out.println("Adjusting Percussion");
    }
}
