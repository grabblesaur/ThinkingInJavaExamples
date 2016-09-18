package reusing;

/**
 * Created by qqq on 25.04.2016.
 */
class Game {
    Game() {

    }
    Game (int i) {
        System.out.println("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame() {

    }
    BoardGame(int i) {
        super(i);
        System.out.println("BoardGame constructor");
    }
}

public class Chess extends BoardGame {
    Chess() {

    }

    Chess(int i) {
        super(i);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess(11);
    }
}
