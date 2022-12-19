package practs.pract_16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

import static java.lang.System.exit;

public class task_1 extends JFrame {
    JButton guessButton = new JButton("Guess");
    JTextField guessField = new JTextField(10);

    int guessedNumber =  ThreadLocalRandom.current().nextInt(0, 20 + 1);
    int userNumber;
    int attempts = 0;

    task_1() {
        super("Guess");
        setSize(250, 150);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLayout(new FlowLayout());
        add(guessButton);
        add(guessField);

        guessButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    attempts++;
                    userNumber = Integer.parseInt(guessField.getText());
                    if (userNumber == guessedNumber) {
                        JOptionPane.showMessageDialog(null, "You guessed!");
                        exit(0);
                    } else if (userNumber > guessedNumber) {
                        JOptionPane.showMessageDialog(null, "Your number is bigger");
                    } else {
                        JOptionPane.showMessageDialog(null, "Your number is smaller");
                    }
                    if (attempts >= 3) {
                        JOptionPane.showMessageDialog(null, "You lose! The number was " + guessedNumber);
                        exit(0);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Incorrect input", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new task_1();
    }
}
