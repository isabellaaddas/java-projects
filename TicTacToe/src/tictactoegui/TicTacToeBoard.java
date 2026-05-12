package tictactoegui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
 * Separate class will handle the board where everything
 * related to the game (showing the board, updating the board,
 * etc.) must happen while the TicTacToeBoardGUI class
 * handles logic to invoke those actions.
 */
public class TicTacToeBoard {
    private JFrame window;
    private JPanel panel;
    // The Map object "board" will hold the name of
    // the cell as the key and a char representing
    // the player's object being held in the label
    private Map<String, Character> board;
    private boolean isFinished;

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

        // Instantiate the board
        board = new HashMap<>();

        isFinished = false;

        window.add(panel);
    }

    // Running this method shows the window with the
    // board
    public void showWindow() {
        window.setVisible(true);
    }

    // This method will check if the grid has a
    // winner at the time of being called; will
    // utilize the map of the board and the cells
    // on the board and return the char representing
    // the winner
    public char findWinner() {
        return '\0';
    }

    /* Private methods */

    // This method will take a given panel and
    // populate it with panels for the grid matrix
    // that will be the TTT game board
    private void setGrid(JPanel p) {
        for (int i = 0; i < 9; i++) {
            JPanel cell = new JPanel();
            cell.setName(String.valueOf(i));
            setCell(cell);
            /* Test player classes and how they look
             * on the board
            URL img = getClass().getResource("x-icon.png");
            PlayerX x = new PlayerX('x', img);
            JLabel player = new JLabel(x.getPlayerIcon());
            cell.add(player); */
            p.add(cell);
        }
    }

    // This method will take a JPanel representing
    // a cell on the board game grid and set it up
    // with specific format setting and a mouse
    // event listener for adding a player icon to the
    // cell (when cell is clicked)
    private void setCell(JPanel cell) {
        // Create new Dimension object that will be the
        // size of each cell
        Dimension size = new Dimension(15, 15);

        cell.setBackground(Color.ORANGE);
        cell.setPreferredSize(size);
        cell.setLayout(new GridBagLayout());
        cell.setLayout(new GridBagLayout());

        cell.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Only carry this function out if the board
                // map doesn't contain the cell's name
                // (if it does, there's already a player
                // object there)
                if (!board.containsKey(cell.getName())) {
                    // Copy the steps from the test to create
                    // a JLabel for the player (x by default
                    // for testing) that will find the correct
                    // image representation, create a player
                    // object, and use its image for the label
                    URL img = getClass().getResource("x-icon.png");
                    PlayerX x = new PlayerX('x', img);
                    JLabel move = new JLabel(x.getPlayerIcon());
                    cell.add(move);

                    // Add this cell's name and player representation
                    // to the board map
                    board.put(cell.getName(), x.getPlayer());

                    // Call revalidate and repaint on the cell
                    // after changes have been made
                    cell.revalidate();
                    cell.repaint();
                }
            }

            // No actions to be taken on these events
            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
    }

    // This method will make a move with a given cell
    // and the player indicated as a char so their icon
    // shows up on the board
    private void makeMove(JPanel cell, char player) {}

    private char winningRow() { return '\0'; }
    private char winningColumn() { return '\0'; }
}