package interfaces.factories.throwThings;

/**
 * Created by qqq on 03.05.2016.
 */
public class GameObjectMainClass {
    public static void roll(GameObjectFactory gof) {
        GameObject go = gof.getGameObject();
        go.roll();
    }

    public static void main(String[] args) {
        roll(new CoinFactory());
        roll(new CubeFactory());
    }
}
