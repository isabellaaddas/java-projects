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
        // Set a boolean variable to handle which
        // player turn is on
        final boolean[] xTurn = {true};

        // Use invoke later and create runnable method to
        // handle the single thread where everything runs
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create instance GameWindow
                TicTacToeBoard game = new TicTacToeBoard();

                // Immediately show the window
                game.showWindow();

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
                        if (e.getSource() instanceof JPanel) {
                            JPanel cellClicked = (JPanel) e.getSource();
                            // If current turn is for player x,
                            // move will be registered with x char
                            if (xTurn[0]) {
                                game.makeMove(cellClicked, 'x');
                                xTurn[0] = !xTurn[0];
                            } else {
                                game.makeMove(cellClicked, 'o');
                                xTurn[0] = !xTurn[0];
                            }
                        }
                    }
                });
            }
        });
    }
}
