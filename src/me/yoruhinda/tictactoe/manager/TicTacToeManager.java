package me.yoruhinda.tictactoe.manager;

import me.yoruhinda.tictactoe.manager.enums.TicTacToeTeam;
import me.yoruhinda.tictactoe.ui.panels.GameBoardPanel;
import me.yoruhinda.tictactoe.ui.panels.ScoreBoardPanel;

import javax.swing.*;
import java.awt.*;

public class TicTacToeManager {
    private static final TicTacToeManager ticTacToeManger = new TicTacToeManager();
    private JButton[][] gameButtons = GameBoardPanel.getGameButtons();
    private TicTacToeTeam ticTacToeTeam;
    private JButton pressButton;
    private int turn;

    public void game(JButton button) {
        pressButton = button;
        turnSystem();
        winVerification();
    }

    public void turnSystem() {
        if (pressButton.getText().equalsIgnoreCase("")) {
            if (turn % 2 == 0) {
                ticTacToeTeam = TicTacToeTeam.CHEESE;
            } else {
                ticTacToeTeam = TicTacToeTeam.CIRCLE;
            }
            turn++;
            printBoard();
        } else {
            JOptionPane.showMessageDialog(null, "this space has occupied!");
        }
    }

    public void printBoard() {
        if (ticTacToeTeam == TicTacToeTeam.CHEESE) {
            pressButton.setText("X");
            pressButton.setFont(new Font("Arial", Font.BOLD, 100));
        } else if (ticTacToeTeam == TicTacToeTeam.CIRCLE) {
            pressButton.setText("O");
            pressButton.setFont(new Font("Arial", Font.BOLD, 100));
        }
    }

    public void winVerification() {
        if (xWin()) {
            JOptionPane.showMessageDialog(null, "X win");
            ScoreBoardPanel.addCheesePoint(1);
            reset();
        } else if (oWin()) {
            JOptionPane.showMessageDialog(null, "O win");
            ScoreBoardPanel.addCirclePoint(1);
            reset();
        } else if (draw()) {
            JOptionPane.showMessageDialog(null, "DRAW");
            reset();
        }
    }

    public boolean xWin() {
        Color color = new Color(128, 0, 0);
        for (JButton[] gameButton : gameButtons) {
            if (gameButton[0].getText().equals("X") && gameButton[1].getText().equals("X") && gameButton[2].getText().equals("X")) {
                gameButton[0].setBackground(color);
                gameButton[1].setBackground(color);
                gameButton[2].setBackground(color);
                return true;
            }
        }
        for (int i = 0; i < gameButtons.length; i++) {
            if (gameButtons[0][i].getText().equals("X") && gameButtons[1][i].getText().equals("X") && gameButtons[2][i].getText().equals("X")) {
                gameButtons[0][i].setBackground(color);
                gameButtons[1][i].setBackground(color);
                gameButtons[2][i].setBackground(color);
                return true;
            }
        }
        if (gameButtons[0][0].getText().equals("X") && gameButtons[1][1].getText().equals("X") && gameButtons[2][2].getText().equals("X")) {
            gameButtons[0][0].setBackground(color);
            gameButtons[1][1].setBackground(color);
            gameButtons[2][2].setBackground(color);
            return true;
        }
        if (gameButtons[0][2].getText().equals("X") && gameButtons[1][1].getText().equals("X") && gameButtons[2][0].getText().equals("X")) {
            gameButtons[0][2].setBackground(color);
            gameButtons[1][1].setBackground(color);
            gameButtons[2][0].setBackground(color);
            return true;
        }
        return false;
    }

    public boolean oWin() {
        Color color = new Color(0, 0, 128);
        for (JButton[] gameButton : gameButtons) {
            if (gameButton[0].getText().equals("O") && gameButton[1].getText().equals("O") && gameButton[2].getText().equals("O")) {
                gameButton[0].setBackground(color);
                gameButton[1].setBackground(color);
                gameButton[2].setBackground(color);
                return true;
            }
        }
        for (int i = 0; i < gameButtons.length; i++) {
            if (gameButtons[0][i].getText().equals("O") && gameButtons[1][i].getText().equals("O") && gameButtons[2][i].getText().equals("O")) {
                gameButtons[0][i].setBackground(color);
                gameButtons[1][i].setBackground(color);
                gameButtons[2][i].setBackground(color);
                return true;
            }
        }
        if (gameButtons[0][0].getText().equals("O") && gameButtons[1][1].getText().equals("O") && gameButtons[2][2].getText().equals("O")) {
            gameButtons[0][0].setBackground(color);
            gameButtons[1][1].setBackground(color);
            gameButtons[2][2].setBackground(color);
            return true;
        }
        if (gameButtons[0][2].getText().equals("O") && gameButtons[1][1].getText().equals("O") && gameButtons[2][0].getText().equals("O")) {
            gameButtons[0][2].setBackground(color);
            gameButtons[1][1].setBackground(color);
            gameButtons[2][0].setBackground(color);
            return true;
        }
        return false;
    }

    public boolean draw() {
        if (!oWin() && !xWin() && turn >= 9) {
            for (JButton[] gameButton : gameButtons) {
                for (JButton button : gameButton) {
                    button.setBackground(new Color(0, 128, 0));
                }
            }
            return true;
        }
        return false;
    }

    public void reset() {
        for (JButton[] gameButton : gameButtons) {
            for (JButton button : gameButton) {
                button.setText("");
                button.setBackground(Color.LIGHT_GRAY);
            }
        }
        turn = 0;
    }

    public void restart() {
        reset();
        ScoreBoardPanel.resetCheeseAndCirclePoint();
    }

    public static TicTacToeManager getInstance() {
        return ticTacToeManger;
    }
}
