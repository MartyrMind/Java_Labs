package practs.pract_15.task_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class Calculator extends JFrame implements ActionListener {
    Map <String, JButton> numButtons = new HashMap<>();
    Map<String, JButton> opButtons = new HashMap<>();
    JButton pointButton = new JButton(".");
    JButton equalButton = new JButton("=");
    JButton plusButton = new JButton("+");
    JButton minusButton = new JButton("-");
    JButton multButton = new JButton("*");
    JButton divButton = new JButton("/");
    JButton clearButton = new JButton("C");
    JButton[] cmdButtons = {pointButton, equalButton, plusButton, minusButton, multButton, divButton, clearButton};
    JTextField resultField = new JTextField(10);
    double operand1, accumulator = 0;
    StringBuilder operand = new StringBuilder("");
    StringBuilder screenText = new StringBuilder("");
    String operation = "";

    public Calculator() {
        super("Calculator");
        setLayout(new BorderLayout());
        JPanel p = new JPanel();
        GridLayout gl = new GridLayout(4, 4);
        gl.setVgap(5);
        p.setLayout(gl);
        for(int i = 0; i < 10; i++) {
            JButton num = new JButton("" + i);
            numButtons.put("" + i, num);
            num.addActionListener(this);
            p.add(num);
        }
        numButtons.put(".", pointButton);
        for (JButton cmdButton : cmdButtons) {
            opButtons.put(cmdButton.getText(), cmdButton);
            cmdButton.addActionListener(this);
            p.add(cmdButton);
        }
        resultField.setFont(new Font("Arial", Font.BOLD, 40));
        add(p, BorderLayout.CENTER);
        add(resultField, BorderLayout.NORTH);
        setSize(400, 400);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String clickedButtonLabel = clickedButton.getText();
        if (numButtons.containsKey(clickedButtonLabel)) {
            operand.append(clickedButtonLabel);
            screenText.append(clickedButtonLabel);
            resultField.setText(screenText.toString());
        }
        if (opButtons.containsKey(clickedButtonLabel)) {
            if (clickedButtonLabel.equals("C")) {
                operand = new StringBuilder("");
                screenText = new StringBuilder("");
                accumulator = 0;
                operation = "";
                resultField.setText("0");
            } else if (clickedButtonLabel.equals("=")) {
                operand1 = Double.parseDouble(operand.toString());
                evaluate(operation);
                screenText = new StringBuilder("" + accumulator);
                operand = new StringBuilder("" + accumulator);
                accumulator = 0;
                operation = "";
                resultField.setText(screenText.toString());
            } else {
                operand1 = Double.parseDouble(operand.toString());
                operand = new StringBuilder("");
                if (operation.equals("")) {
                    accumulator = operand1;
                } else {
                    evaluate(operation);
                }
                operation = clickedButtonLabel;
                screenText.append(operation);
                resultField.setText(screenText.toString());
            }
        }

    }
    private void evaluate(String expression) {
        switch (operation) {
            case "+":
              accumulator += operand1;
              break;
            case "-":
                accumulator -= operand1;
                break;
            case "*":
               accumulator *= operand1;
                break;
            case "/":
                if (operand1 == 0.0) {
                    JOptionPane.showMessageDialog(null, "Division by zero", "alert", JOptionPane.ERROR_MESSAGE);
                }
               else accumulator /= operand1;
               break;
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
