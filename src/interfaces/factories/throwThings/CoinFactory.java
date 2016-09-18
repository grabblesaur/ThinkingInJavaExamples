package interfaces.factories.throwThings;

/**
 * Created by qqq on 03.05.2016.
 */
public class CoinFactory implements GameObjectFactory{
    @Override
    public GameObject getGameObject() {
        return new Coin();
    }
}
