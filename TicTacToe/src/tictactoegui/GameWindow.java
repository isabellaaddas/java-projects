package tictactoegui;
import javax.swing.*;

/*
 * Separate class will handle the game window where everything
 * related to the game (showing the board, updating the board,
 * etc.) must happen while the TicTacToeBoard class handles
 * logic to invoke those actions.
 */
public class GameWindow {
    private JFrame window;

    // Create instance of the game window with some options
    // to handle default closing, size, etc.
    public GameWindow() {
        window = new JFrame();
        window.setTitle("Tic-Tac-Toe");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(500, 600);
        window.setLocation(null);
    }

    // Running this method shows the window with the
    // board
    public void showWindow() {
        window.setVisible(true);
    }
}
