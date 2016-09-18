package operators;

/**
 * Created by qqq on 29.03.2016.
 */
public class Coin {

    public boolean throwCoin () {
        return ((int) (Math.random() * 2)) == 1 ? true : false;
    }

    public static void main(String[] args) {
        Coin coin = new Coin();
        for (int i = 0; i < 50; i++) {
            System.out.println(coin.throwCoin());
        }
    }
}
