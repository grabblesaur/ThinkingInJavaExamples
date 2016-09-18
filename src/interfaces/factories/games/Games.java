package interfaces.factories.games;

/**
 * Created by qqq on 03.05.2016.
 */
public class Games {
    public static void playGame(GameFactory gf) {
        Game g = gf.getGame();
        while(g.move());
    }

    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }
}
