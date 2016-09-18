package interfaces.factories.games;

/**
 * Created by qqq on 03.05.2016.
 */
public class Checkers implements Game{
    private int moves = 0;
    private static final int MOVES = 3;

    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }
}

class CheckersFactory implements GameFactory {
    public Game getGame() {
        return new Checkers();
    }
}
