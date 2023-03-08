package me.yoruhinda.tictactoe.ui.panels;

import me.yoruhinda.tictactoe.listeners.GameBoardListener;

import javax.swing.*;
import java.awt.*;

public class GameBoardPanel extends JPanel {
    private static final JButton[][] gameButtons = new JButton[3][3];

    public GameBoardPanel() {
        initGameBoardPanel();
        createGameButtonsAndSettParameters();
    }

    private void initGameBoardPanel() {
        this.setLayout(new GridLayout(3, 3));
        this.setBorder(BorderFactory.createEmptyBorder(60, 60, 60, 60));
        this.setBackground(new Color(21, 60, 78));
    }

    private void createGameButtonsAndSettParameters() {
        GameBoardListener gameBoardListener = new GameBoardListener();
        for (int i = 0; i < gameButtons.length; i++) {
            for (int j = 0; j < gameButtons[i].length; j++) {
                gameButtons[i][j] = new JButton();
                gameButtons[i][j].setBackground(Color.LIGHT_GRAY);
                gameButtons[i][j].setBorder(BorderFactory.createLineBorder(Color.BLACK));
                gameButtons[i][j].setFocusPainted(false);
                gameButtons[i][j].addActionListener(gameBoardListener);
                this.add(gameButtons[i][j]);
            }
        }
    }

    public static JButton[][] getGameButtons(){
        return gameButtons;
    }
}
