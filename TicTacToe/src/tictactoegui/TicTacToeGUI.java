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
            }
        });
    }
}
