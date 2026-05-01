package tictactoegui;

import javax.swing.*;
import java.net.URL;

public class PlayerX extends TicTacToePlayer {
    // Implement the constructor with 'x' and the
    // proper path to the x icon
    PlayerX(char p, URL path) {
        super(p, path);
    }

    PlayerX() {
        URL img = TicTacToeBoard.class.getResource("x-icon.png");
        new PlayerX('x', img);
    }
}
