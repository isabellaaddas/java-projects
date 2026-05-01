package tictactoegui;

import javax.swing.*;
import java.net.URL;

public class PlayerO extends TicTacToePlayer {
    // Implement the constructor with 'o' and the
    // proper path to the o icon
    PlayerO(char p, URL path) {
        super(p, path);
    }

    PlayerO() {
        URL img = TicTacToeBoard.class.getResource("o-icon.png");
        new PlayerX('x', img);
    }
}
