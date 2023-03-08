package me.yoruhinda.tictactoe.listeners;

import me.yoruhinda.tictactoe.manager.TicTacToeManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameBoardListener implements ActionListener {
    private TicTacToeManager ticTacToeManager = TicTacToeManager.getInstance();

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        ticTacToeManager.game(button);
    }
}
