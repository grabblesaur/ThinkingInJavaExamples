package polymorphism.music2;
/**
 * Расширяемая программа
 */
import polymorphism.music.Note;

public class Instrument {
    void play(Note n) {
        System.out.println("Instrument.play() " + n);
    }
    String what() {return "Instrument";}
    void adjust() {
        System.out.println("Adjusting Instrument");
    }
}
