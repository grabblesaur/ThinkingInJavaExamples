package polymorphism.endOperations;

public class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("имеется сердце");
    private Description t = new Description("животное, не растение");

    Animal() {
        System.out.println("Animal()");
    }

    @Override
    protected void dispose() {
        System.out.println("dispose() в Animal");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
