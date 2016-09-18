package interfaces.factories.developers;

/**
 * Created by qqq on 03.05.2016.
 */
public class JavaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }
}
