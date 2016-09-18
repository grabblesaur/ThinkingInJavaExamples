package polymorphism.step10;

/**
 * Created by qqq on 29.04.2016.
 */
public class BasicClass {
    void run(){
        clear();
        System.out.println("BasicClass.run()");
    }
    void clear(){
        System.out.println("BasicClass.clear(): clear before run");
    }
}

class ChildClass extends BasicClass {
    @Override
    void clear() {
        System.out.println("ChildClass.clear()");
    }

    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        cc.run();
    }
}