package me.yoruhinda.tictactoe.ui.panels;

import javax.swing.*;
import java.awt.*;

public class TicTacToePanel extends JPanel {
    private GameBoardPanel gameBoardPanel = new GameBoardPanel();
    private ScoreBoardPanel scoreBoardPanel = new ScoreBoardPanel();
    private RestartGameButtonPanel restartGameButtonPanel = new RestartGameButtonPanel();

    public TicTacToePanel() {
        this.initTicTacToePanel();
    }

    private void initTicTacToePanel(){
        this.setLayout(new BorderLayout());
        this.add(gameBoardPanel, BorderLayout.CENTER);
        this.add(scoreBoardPanel, BorderLayout.NORTH);
        this.add(restartGameButtonPanel, BorderLayout.SOUTH);
    }
}
