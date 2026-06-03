package tictactoegui;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


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

                // Add a mouse event listener for the entire
                // board to invoke the makeMove() method,
                // which will automatically handle the game
                // state upon being finished
                game.getPanel().addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        // Only make a move if the object that
                        // was clicked is a panel object, aka
                        // a cell on the board
                    }
                });
            }
        });
    }
}
