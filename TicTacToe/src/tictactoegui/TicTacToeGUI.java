package tictactoegui;
import javax.swing.*;

/*
 * This class will be the board where everything happens for
 * a game of Tic Tac Toe.
 */
public class TicTacToeGUI {

    public static void main(String[] args) {
        // Use invoke later and create runnable method to
        // handle the single thread where everything runs
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create instance GameWindow
                TicTacToeBoard game = new TicTacToeBoard();

                // Immediately show the window
                game.showWindow();

                // Set a boolean variable to handle which
                // player turn is on
                boolean xTurn = true;

                // Run a while loop while the game isn't
                // finished to allow for two players to
                // play a game, taking turns between x
                // and o moves
                while (!game.isFinished()) {
                    // If x's turn, make move as x
                    if (xTurn) {

                    }
                }
            }
        });
    }
}
