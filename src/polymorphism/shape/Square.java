package polymorphism.shape;

/**
 * Created by qqq on 28.04.2016.
 */
public class Square extends Shape{
    @Override
    public void draw() {
        System.out.println("Square.draw()");
    }

    @Override
    public void erase() {
        System.out.println("Square.erase()");
    }
}
