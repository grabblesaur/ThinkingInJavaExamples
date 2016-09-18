package casting;

/**
 * Created by qqq on 18.04.2016.
 */
public class StringComparing {

    public static void main(String[] args) {
        compareThese("team", "meat");
        compareThese("a", "a");
        String str1 = "10", str2 = String.valueOf(10);
        compareThese(str1, str2);
    }

    public static void compareThese(String str1, String str2) {
        System.out.printf("Compare for %s and %s%n", str1, str2);
        System.out.println("==: " + (str1 == str2));
        System.out.println("!=: " + (str1 != str2));
        System.out.println("equals: " + str1.equals(str2));
    }
}
