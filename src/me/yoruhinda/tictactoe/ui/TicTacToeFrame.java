package me.yoruhinda.tictactoe.ui;

import me.yoruhinda.tictactoe.ui.panels.TicTacToePanel;

import javax.swing.*;
import java.awt.*;

public class TicTacToeFrame extends JFrame {
    private final int FrameWidth = 640;
    private final int FrameHeight = 640;
    private Image image = new ImageIcon("src/me/yoruhinda/tictactoe/images/TictactoeIcon.png").getImage();
    private TicTacToePanel ticTacToePanel = new TicTacToePanel();

    public TicTacToeFrame() {
        initFrame();
    }

    private void initFrame() {
        this.setTitle("Tic Tac Toe");
        this.setSize(FrameWidth, FrameHeight);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setIconImage(image);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.add(ticTacToePanel);
        this.setVisible(true);
    }

}
