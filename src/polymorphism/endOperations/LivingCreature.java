package polymorphism.endOperations;

/**
 * Created by qqq on 29.04.2016.
 */
public class LivingCreature {
    private Characteristic p = new Characteristic("живое существо");
    private Description t = new Description("обычное живое существо");

    public LivingCreature() {
        System.out.println("LivingCreature()");
    }

    protected void dispose() {
        System.out.println("dispose() в LivingCreature ");
        t.dispose();
        p.dispose();
    }
}
