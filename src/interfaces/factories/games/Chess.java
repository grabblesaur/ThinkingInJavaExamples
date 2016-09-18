package interfaces.factories.games;

/**
 * Created by qqq on 03.05.2016.
 */
public class Chess implements Game{
    private int moves = 0;
    private static final int MOVES = 4;

    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }
}

class ChessFactory implements GameFactory {
    public Game getGame() {
        return new Chess();
    }
}
