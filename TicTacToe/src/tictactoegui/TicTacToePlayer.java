package tictactoegui;

import javax.swing.*;
import java.net.URL;

public abstract class TicTacToePlayer {
    private char player;
    private ImageIcon playerIcon;

    // Constructor will take a char value and a
    // String value representing the player (x or
    // o) and the path to the icon to use for
    // that player, passed up from the subclass
    TicTacToePlayer(char p, URL path) {
        player = p;
        playerIcon = new ImageIcon(path);
    }

    // This method will retrieve the icon object
    // representing the player's icon
    public ImageIcon getPlayerIcon() {
        return playerIcon;
    }

    // This method will retrieve the char variable
    // representing which player the instance is
    public char getPlayer() {
        return player;
    }
}
