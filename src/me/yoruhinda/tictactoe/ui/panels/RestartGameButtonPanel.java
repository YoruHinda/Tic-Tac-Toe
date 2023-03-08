package me.yoruhinda.tictactoe.ui.panels;

import me.yoruhinda.tictactoe.listeners.RestartGameListener;

import javax.swing.*;
import java.awt.*;

public class RestartGameButtonPanel extends JPanel {
    private JButton restartButton = new JButton();

    public RestartGameButtonPanel() {
        setParametersForRestartButton();
        initRestartPanel();
    }


    private void initRestartPanel() {
        this.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));
        this.setLayout(new FlowLayout());
        this.setBackground(new Color(21, 60, 78));
        this.add(restartButton);
    }

    private void setParametersForRestartButton() {
        restartButton.setText("Restart Game");
        restartButton.setBackground(Color.LIGHT_GRAY);
        restartButton.setFocusPainted(false);
        restartButton.addActionListener(new RestartGameListener());
        restartButton.setPreferredSize(new Dimension(200, 50));
    }
}
