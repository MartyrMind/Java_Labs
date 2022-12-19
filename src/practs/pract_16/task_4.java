package practs.pract_16;

import javax.swing.*;
import java.awt.*;

public class task_4 extends JFrame {
    JLabel loginLabel = new JLabel("Login: ", JLabel.RIGHT);
    JTextField loginField = new JTextField(20);

    JLabel passwordLabel = new JLabel("Password: ", JLabel.RIGHT);
    JPasswordField passwordField = new JPasswordField(20);

    JLabel confirmLabel = new JLabel("Confirm password: ", JLabel.RIGHT);
    JPasswordField confirmPasswordField = new JPasswordField(20);

    JButton login = new JButton("Enter");

    task_4() {
        super("Login and password");
        setTitle("Login Form");
        setVisible(true);
        setBounds(10,10,370,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        setResizable(false);

        Container container=getContentPane();
        container.setLayout(null);

        loginLabel.setBounds(50,50,100, 15);
        passwordLabel.setBounds(50,90,100,15);
        confirmLabel.setBounds(1,130,150,15);

        loginField.setBounds(160,50,120,15);
        passwordField.setBounds(160,90,120,15);
        confirmPasswordField.setBounds(160,130,120,15);

        login.setBounds(50,190,100,30);
        login.addActionListener(e -> {
            if (passwordField.getText().equals(confirmPasswordField.getText())) {
                JOptionPane.showMessageDialog(null, "Welcome!", "success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Passwords doesn't match", "alert", JOptionPane.ERROR_MESSAGE);
            }
        });

        container.add(loginLabel);
        container.add(passwordLabel);
        container.add(confirmLabel);
        container.add(loginField);
        container.add(passwordField);
        container.add(confirmPasswordField);
        container.add(login);


    }

    public static void main(String[] args) {
        new task_4();
    }
}
