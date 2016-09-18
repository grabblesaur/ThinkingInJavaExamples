package interfaces.factories.developers;

/**
 * Created by qqq on 03.05.2016.
 */
public class PhpDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }
}
