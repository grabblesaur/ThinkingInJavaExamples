package operators;

public class Literals {

    public static void main(String[] args) {
        int i1 = 0x2f; //16 сс (нижний регистр)
        System.out.println("i1: " + Integer.toBinaryString(i1));
        int i2 = 0X2F; //16 сс (верхний регистр)
        System.out.println("i2: " + Integer.toBinaryString(i2));
        int i3 = 0177; //Восьмеричное (начинается с нуля)
        System.out.println("i3: " + Integer.toBinaryString(i3));

        char c = 0xffff; //макс. шестнадцатеричное значение char
        System.out.println("c: " + c + ":: c(char): " + Integer.toBinaryString(c));

        byte b = 0x7f; //макс. 16 значение byte
        System.out.println("b: " + b + ":: b(byte): " + Integer.toBinaryString(b));

        short s = 0x7fff; //максю 16 значение short
        System.out.println("s: " + s + ":: s(short): " + Integer.toBinaryString(s));

        long n1 = 0x2e; //means long
        System.out.println("n1: " + Long.toBinaryString(n1));

        long n2 = 200l; //same
        System.out.println("n2: " + Long.toBinaryString(n2));

        long n3 = 0177;
        System.out.println("n3: " + Long.toBinaryString(n3));

        float f1 = 1;
        float f2 = 1F; //means float
        float f3 = 1f; //same

        double d1 = 1d; //means double
        double d2 = 1D; //same

        someOperations("abc", "abc");
    }

    public static void someOperations (String str1, String str2) {
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1 + str2);
        System.out.println(str1.concat(str2));

    }
}
