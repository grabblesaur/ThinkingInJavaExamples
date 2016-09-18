package polymorphism.music2;

import polymorphism.music.Note;

/**
 * Created by qqq on 28.04.2016.
 */
public class Woodwind extends Wind {
    @Override
    void play(Note n) {
        System.out.println("Woodwind.play() " + n);
    }

    @Override
    String what() {
        return "Woodwind";
    }
}
