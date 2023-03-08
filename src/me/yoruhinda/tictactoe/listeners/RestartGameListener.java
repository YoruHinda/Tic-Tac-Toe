package me.yoruhinda.tictactoe.listeners;

import me.yoruhinda.tictactoe.manager.TicTacToeManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RestartGameListener implements ActionListener {
    private TicTacToeManager ticTacToeManager = TicTacToeManager.getInstance();
    @Override
    public void actionPerformed(ActionEvent e) {
        ticTacToeManager.restart();
    }
}
