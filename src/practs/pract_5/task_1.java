package practs.pract_5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.SwingConstants.*;

public class task_1 {
    //Футбольный кликер
    static JFrame frame = new JFrame("Clicker");
    JButton milan = new JButton("AC Milan");
    JButton madrid = new JButton("Madrid");
    JLabel res = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
    JLabel lastScorer = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
    JLabel winner = new JLabel("Winner: DRAW", CENTER);
    JPanel labels = new JPanel(new GridLayout(3, 1));

    private String acMilan = "AC MILAN";
    private String realMadrid = "Real Madrid";

    private int milanScore = 0;
    private int madridScore = 0;

    public task_1() {
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        labels.setSize(250, 400);
        labels.add(winner);
        labels.add(lastScorer);
        labels.add(res);

        milan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                milanScore ++;
                res.setText("Result: " + milanScore + " X " + madridScore);
                lastScorer.setText("Last Scorer: " + acMilan);
                if (milanScore > madridScore) {
                    winner.setText("Winner: " + acMilan);
                }
                if (milanScore == madridScore) winner.setText("Winner: DRAW");
            }
        });

        madrid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                madridScore++;
                res.setText("Result: " + milanScore + " X " + madridScore);
                lastScorer.setText("Last Scorer: " + realMadrid);
                if (milanScore < madridScore) winner.setText("Winner: " + realMadrid);
                if (milanScore == madridScore) winner.setText("Winner: DRAW");
            }
        });

        frame.add(milan, BorderLayout.EAST);
        frame.add(madrid, BorderLayout.WEST);
        frame.add(labels, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        task_1 myApp = new task_1();
        frame.setVisible(true);
    }
}
