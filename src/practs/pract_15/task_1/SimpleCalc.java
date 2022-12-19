package practs.pract_15.task_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SimpleCalc  extends JFrame {
    JTextField num1 = new JTextField(10);
    JTextField num2 = new JTextField(10);
    JButton plus = new JButton("+");
    JButton minus = new JButton("-");
    JButton mult = new JButton("*");
    JButton div = new JButton("/");
    Font font = new Font("Arial", Font.BOLD, 20);

    SimpleCalc() {
        super("SimpleCalc");
        setLayout(new FlowLayout());
        setSize(250, 150);

        add(new JLabel("First number:"));
        add(num1);

        add(new JLabel("Second number:"));
        add(num2);

        add(plus);
        add(minus);
        add(mult);
        add(div);

        // Добавляем обработчики событий
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(num1.getText());
                    double n2 = Double.parseDouble(num2.getText());
                    JOptionPane.showMessageDialog(null, "Result: " + (n1 + n2));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Incorrect input", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(num1.getText());
                    double n2 = Double.parseDouble(num2.getText());
                    JOptionPane.showMessageDialog(null, "Result: " + (n1 - n2));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Incorrect input", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        mult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(num1.getText());
                    double n2 = Double.parseDouble(num2.getText());
                    JOptionPane.showMessageDialog(null, "Result: " + (n1 * n2));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Incorrect input", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        div.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double n1 = Double.parseDouble(num1.getText());
                    double n2 = Double.parseDouble(num2.getText());
                    double res = n1 / n2;
                    if (Double.isInfinite(res)) {
                        JOptionPane.showMessageDialog(null, "Division by zero", "alert", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Result: " + res);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Incorrect input", "alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new SimpleCalc();
    }
}
