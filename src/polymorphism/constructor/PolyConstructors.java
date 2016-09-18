package polymorphism.constructor;

/***
 * Конструкторы и полиморфизм дают не тот результат,
 * который можно было бы ожидать.
 */

class Glyph {
    public Glyph() {
        System.out.println("Glyph() перед вызовом draw()");
        draw();
        System.out.println("Glyph() после вызова draw()");
    }

    void draw() {
        System.out.println("Glyph.draw");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;

    public RoundGlyph(int r) {
        this.radius = r;
        System.out.println("RoundGlyph.RoundGlyph(), " +
                "radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(), " +
                "radius = " + radius);
    }
}

public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
