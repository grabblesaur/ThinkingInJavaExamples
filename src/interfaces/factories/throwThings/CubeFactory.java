package interfaces.factories.throwThings;

/**
 * Created by qqq on 03.05.2016.
 */
public class CubeFactory implements GameObjectFactory {
    @Override
    public GameObject getGameObject() {
        return new Cube();
    }
}
