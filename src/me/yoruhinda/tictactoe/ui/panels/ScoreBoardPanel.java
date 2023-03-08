package me.yoruhinda.tictactoe.ui.panels;

import javax.swing.*;
import java.awt.*;

public class ScoreBoardPanel extends JPanel {
    private static JLabel circleScore = new JLabel();
    private static JLabel cheeseScore = new JLabel();
    private static int circleScorePoint = 0;
    private static int cheeseScorePoint = 0;

    public ScoreBoardPanel(){
        setParametersForButtons();
        initScoreBoardPanel();
    }

    private void initScoreBoardPanel() {
        this.setLayout(new GridLayout(0,2));
        this.setBackground(new Color(21,60,78));
        this.add(cheeseScore);
        this.add(circleScore);
    }

    private void setParametersForButtons() {
        cheeseScore.setText("X : " + cheeseScorePoint);
        circleScore.setText("O : " + circleScorePoint);
        circleScore.setFont(new Font("S",Font.BOLD,50));
        cheeseScore.setFont(new Font("S",Font.BOLD,50));
        cheeseScore.setForeground(Color.WHITE);
        circleScore.setForeground(Color.WHITE);
        cheeseScore.setBorder(BorderFactory.createEmptyBorder(0,100,0,0));
        circleScore.setBorder(BorderFactory.createEmptyBorder(0,100,0,0));
    }

    public static void addCirclePoint(int point){
        circleScorePoint += point;
        circleScore.setText("O : " + circleScorePoint);
    }

    public static void addCheesePoint(int point){
        cheeseScorePoint += point;
        cheeseScore.setText("X : " + cheeseScorePoint);
    }

    public static void resetCheeseAndCirclePoint(){
        circleScorePoint = 0;
        cheeseScorePoint = 0;
        circleScore.setText("O : " + circleScorePoint);
        cheeseScore.setText("X : " + cheeseScorePoint);
    }
}
