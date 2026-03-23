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
    boolean is_finished;

    public TTTGameLogic() {
        board = new char[3][3];
        player_x = 'x';
        player_o = 'o';
        is_finished = false;
    }

    /*
     * Functions for game logic: making moves, checking
     * for a win, printing the board, and calculating
     * the board spaces
     */

    // Print the board in its current state
    public void print_board() {
        // Since the board is a fixed size, only 3 print
        // statements are needed
        System.out.print(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.print(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.print(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
    }
}
