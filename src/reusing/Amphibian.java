package reusing;

/**
 * Created by qqq on 26.04.2016.
 */
public class Amphibian {
    public void swim() {}
    public void sleep() {}

    public static void main(String[] args) {
        Frog f = new Frog();
        f.jump();
        f.swim();
        f.sleep();
    }
}

class Frog extends Amphibian {
    public void jump(){}

    @Override
    public void swim() {
        System.out.println("frog swims");
    }

    @Override
    public void sleep() {
        System.out.println("Zzz...");
    }
}


