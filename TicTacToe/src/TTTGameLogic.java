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
    // moves)
    char[][] board;
    char player_x;
    char player_o;
    boolean is_finished;

    public TTTGameLogic() {
        board = new char[3][3];
        initialize_board();
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
        System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
    }

    // Check for a win by examining the limited win cases
    public char find_winner() {
        // For all checked cases, if a winner is found, switch
        // the is_finished flag to "true" to avoid making moves

        // First iterate through the rows and columns of the
        // board, returning the first instance of a win when
        // one is found
        for (int i = 0; i < 3; i++) {
            char result = winning_row(i, 0);
            if (result != ' ') {
                is_finished = true;
                return result;
            }
        }

        for (int j = 0; j < 3; j++) {
            char result = winning_column(0, j);
            if (result != ' ') {
                is_finished = true;
                return result;
            }
        }

        // Then check for the special diagonal cases where
        // a win might be possible
        if ((board[0][0] == player_x) && (board[1][1]) == (board[2][2])) {
            is_finished = true;
            return player_x;
        }
        return ' ';
    }

    /*
     * Private helper methods called within public
     * methods.
     */

    // Initialize the board upon construction
    // a single space character
    private void initialize_board() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Find if the row has a winner
    // Parameter: two index values, pointing towards
    // the first cell in a row
    private char winning_row(int i, int j) {
        // For the first cell in a row, knowing that
        // the board is 3x3, check the next 2 cells to
        // the right for a match
        if ((board[i][j] == player_x) && (board[i][j] == board[i][j + 1])
                && (board[i][j + 1] == board[i][j + 2])) {
            return player_x;
        } else if ((board[i][j] == player_o) && (board[i][j] == board[i][j + 1])
                && (board[i][j + 1] == board[i][j + 2])) {
            return player_o;
        }

        return ' ';
    }

    // Find if the column has a winner
    // Parameter: two index values, pointing towards
    // the first cell in a column
    private char winning_column(int i, int j) {
        // For the first cell in a column, knowing that
        // the board is 3x3, check the next 2 cells to
        // below for a match
        if ((board[i][j] == player_x) && (board[i][j] == board[i + 1][j])
                && (board[i + 1][j] == board[i + 2][j])) {
            return player_x;
        } else if ((board[i][j] == player_o) && (board[i][j] == board[i + 1][j])
                && (board[i + 1][j] == board[i + 2][j])) {
            return player_o;
        }

        return ' ';
    }
}
