package polymorphism.music2;

import polymorphism.music.Note;

public class Music2 {
    /***
     * Работа метода не зависит от фактического типа объекта,
     * поэтому типы, добавленные в систему, будут работать правильно:
     */
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void tuneAll(Instrument[] e) {
        for (Instrument i : e)
            tune(i);
    }

    public static void main(String[] args) {
        //Восходящее преобразование
        //При добавлении в массив:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}
