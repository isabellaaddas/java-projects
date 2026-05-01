package tictactoegui;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

/*
 * Separate class will handle the board where everything
 * related to the game (showing the board, updating the board,
 * etc.) must happen while the TicTacToeBoardGUI class
 * handles logic to invoke those actions.
 */
public class TicTacToeBoard {
    private JFrame window;
    private JPanel panel;

    // Create instance of the game window with some options
    // to handle default closing, size, etc.
    public TicTacToeBoard() {
        // JFrame window settings
        window = new JFrame();
        window.setTitle("Tic-Tac-Toe");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(500, 500);
        window.setLocationRelativeTo(null);

        // JPanel settings
        panel = new JPanel();
        panel.setLayout(new GridLayout(3, 3, 5, 5));
        panel.setBackground(Color.BLACK);
        setGrid(panel);

        window.add(panel);
    }

    // Running this method shows the window with the
    // board
    public void showWindow() {
        window.setVisible(true);
    }

    /* Private methods */

    // This method will take a given panel and
    // populate it with panels for the grid matrix
    // that will be the TTT game board
    private void setGrid(JPanel p) {
        // Create new Dimension object that will be the
        // size of each cell
        Dimension size = new Dimension(15, 15);
        for (int i = 0; i < 9; i++) {
            JPanel cell = new JPanel();
            cell.setBackground(Color.ORANGE);
            cell.setPreferredSize(size);
            cell.setLayout(new GridBagLayout());
            /* Test player classes and how they look
             * on the board
            URL img = getClass().getResource("x-icon.png");
            PlayerX x = new PlayerX('x', img);
            JLabel player = new JLabel(x.getPlayerIcon());
            cell.add(player); */
            p.add(cell);
        }
    }
}