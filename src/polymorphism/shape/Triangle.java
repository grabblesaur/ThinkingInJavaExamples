package polymorphism.shape;

/**
 * Created by qqq on 28.04.2016.
 */
public class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Triangle.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Triangle.erase()");
    }

    @Override
    public void trashMethod() {
        System.out.println("Triangle.trashMethod(): just output messsage");
    }
}
