package polymorphism.music;

/**
 * Created by qqq on 27.04.2016.
 */
public class Wind extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Wind.play()" + n);
    }
}
