/*
 * This is a simple class to test the logic of a normal
 * tic-tac-toe game.
 * The class will be tested in a separate file before being
 * used as the main logic of a full mini-game with GUI
 * powered by Java Swing.
 */

public class TTTGameLogic {
    // Variables for a board (3x3), two players (x and o),
    // and whether the game is finished (cannot make more
    // moves
    char[][] board;
    char player_x;
    char player_o;
    boolean isFinished;

    public TTTGameLogic() {
        board = new char[3][3];
    }
}
