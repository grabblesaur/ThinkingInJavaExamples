package interfaces.factories.developers;

/**
 * Created by qqq on 03.05.2016.
 */
public class Main {
    public static void takeInfo(DeveloperFactory df) {
        Developer d = df.getDeveloper();
        d.write();
    }

    public static void main(String[] args) {
        takeInfo(new JavaDeveloperFactory());
        takeInfo(new PhpDeveloperFactory());
    }
}
