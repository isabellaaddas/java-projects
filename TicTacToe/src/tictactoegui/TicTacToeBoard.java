package tictactoegui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

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

    // This method will make a move with a given cell
    // and the player indicated as a char so their icon
    // shows up on the board
    public void makeMove(JPanel cell, char player) {
        // Only carry this function out if the board
        // map doesn't contain the cell's name
        // (if it does, there's already a player
        // object there)
        if (!board.containsKey(cell.getName())) {
            // Copy the steps from the test to create
            // a JLabel for the player that will find the
            // correct image representation, create a player
            // object, and use its image for the label
            URL img = getClass().getResource(player == 'x'? "x-icon.png" : "o-icon.png");
            if (player == 'x') {
                PlayerX x = new PlayerX('x', img);
                JLabel move = new JLabel(x.getPlayerIcon());
                cell.add(move);
                // Add this cell's name and player representation
                // to the board map
                board.put(cell.getName(), x.getPlayer());
            } else {
                PlayerO o = new PlayerO('o', img);
                JLabel move = new JLabel(o.getPlayerIcon());
                cell.add(move);
                board.put(cell.getName(), o.getPlayer());
            }

            // Call revalidate and repaint on the cell
            // after changes have been made
            cell.revalidate();
            cell.repaint();
        }
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
    }

    // This method will take an int value where the
    // row starts and check that the next 2 spaces
    // are both matching the first cell and each other
    // (calculated on indices 0-8 as a 1D array)
    private char winningRow(int start) {
        // First, check that the starting cell and next
        // 2 cells are in the hash table (contain player
        // moves)
        if (board.containsKey(start + "") && board.containsKey((start + 1) + "")
                && board.containsKey((start + 2) + "")) {
            // Then check that the row contains all x's or
            // all o's
            if ((board.get(start + "") == 'x') && (board.get(start + "") == board.get((start + 1) + ""))
                    && (board.get((start + 1) + "") == board.get((start + 2) + ""))) {
                return 'x';
            } else if ((board.get(start + "") == 'o') && (board.get(start + "") == board.get((start + 1) + ""))
                    && (board.get((start + 1) + "") == board.get((start + 2) + ""))) {
                return 'o';
            }
        }

        // Otherwise, return space char
        return ' ';
    }

    // This method will take an int value where the
    // column starts and check the next 2 spaces down
    // are both matching the first cell and each other
    // (calculated on indices 0-8 as a 1D array)
    private char winningColumn(int start) {
        // First, check that the starting cell and next
        // 2 cells are in the hash table (contain player
        // moves)
        if (board.containsKey(start + "") && board.containsKey((start + 3) + "")
                && board.containsKey((start + 6) + "")) {

        }
        return '\0';
    }
}