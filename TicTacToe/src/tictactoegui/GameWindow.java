package tictactoegui;
import javax.swing.*;
import java.awt.*;

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
        // JFrame window settings
        window = new JFrame();
        window.setTitle("Tic-Tac-Toe");
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(500, 500);
        window.setLocationRelativeTo(null);

        // JPanel settings
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        panel.setBackground(Color.ORANGE);

        window.add(panel);
    }

    // Running this method shows the window with the
    // board
    public void showWindow() {
        window.setVisible(true);
    }
}
