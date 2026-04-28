package tictactoegui;

import javax.swing.*;

public abstract class TicTacToePlayer {
    private char player;
    private ImageIcon playerIcon;

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

    // This method will set the icon based on which
    // player (x or o) the object instance is
    abstract void setPlayerIcon();

    // This method will set the char variable for an
    // instance of a player subclass
    abstract void setPlayer();
}
