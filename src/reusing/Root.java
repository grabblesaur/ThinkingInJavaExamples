package reusing;
public class Root {
    Component1 c1 = new Component1();
    Component2 c2 = new Component2();
    Component3 c3 = new Component3();

    Root(String str) {
        System.out.println("Root constructor");
    }
}

class Stem extends Root {
    Stem(String str) {
        super(str);
        System.out.println("Stem constructor");
    }
}