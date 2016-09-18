package polymorphism.endOperations;

public class Amphibian extends Animal {
    private Characteristic p = new Characteristic("может жить в воде");
    private Description t = new Description("и в воде, и на земле");

    public Amphibian() {
        System.out.println("Amphibian()");
    }

    @Override
    protected void dispose() {
        System.out.println("dispose() в Amphibian ");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}
