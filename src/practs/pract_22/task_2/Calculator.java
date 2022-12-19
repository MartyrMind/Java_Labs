package practs.pract_22.task_2;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Calculator extends JFrame implements ActionListener {
    Map <String, JButton> numButtons = new HashMap<>();
    Map<String, JButton> opButtons = new HashMap<>();
    JButton pointButton = new JButton(".");
    JButton equalButton = new JButton("=");
    JButton plusButton = new JButton("+");
    JButton minusButton = new JButton("-");
    JButton multButton = new JButton("*");
    JButton divButton = new JButton("/");

    JButton spaceButton = new JButton("space");
    JButton clearButton = new JButton("C");
    JButton[] cmdButtons = {equalButton, plusButton, minusButton, multButton, divButton, clearButton, spaceButton};
    JTextField resultField = new JTextField(20);
    JTextField operandField = new JTextField(20);

    Number result = 0;

    StringBuilder operand = new StringBuilder("");
    StringBuilder screenText = new StringBuilder("");

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
        resultField.setFont(new Font("Arial", Font.BOLD, 20));
        operandField.setFont(new Font("Arial", Font.BOLD, 20));
        add(p, BorderLayout.CENTER);
        add(resultField, BorderLayout.NORTH);
        add(operandField, BorderLayout.SOUTH);
        setSize(400, 400);
        this.setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        String clickedButtonLabel = clickedButton.getText();

        if (clickedButtonLabel.equals("C")) {
            resultField.setText("");
            operandField.setText("");
            result = 0;
        } else if (clickedButtonLabel.equals("=")) {
            evaluate(resultField.getText().split(" "));
        } else {
            if (clickedButtonLabel.equals("space")) {
                resultField.setText(resultField.getText() + " ");
            } else {
                resultField.setText(resultField.getText() + clickedButtonLabel);
            }
        }

    }

    private void evaluate(String[] inputArray) {
        Stack<Integer> stack = new Stack<>();
        Stack<String> info = new Stack<>();
        if (inputArray.length < 3) {
            resultField.setText("Invalid input. Press C to try again");
            return;
        }
        for (String s : inputArray) {
            if (s != null && s.matches("\\d+")) {
                stack.push(Integer.parseInt(s));
                info.push(s);
            } else {
                if (stack.size() >= 2) {
                    int a = stack.pop();
                    int b = stack.pop();
                    int result = 0;
                    switch (s.charAt(0)) {
                        case '+':
                            result = a + b;
                            break;
                        case '-':
                            result = a - b;
                            break;
                        case '*':
                            result = a * b;
                            break;
                        case '/':
                            try {
                                result = a / b;
                            } catch (ArithmeticException e) {
                                resultField.setText("Division by zero. Press C to try again.");
                                return;
                            }
                            break;
                    }
                    stack.push(result);
                    String op1 = info.pop();
                    String op2 = info.pop();
                    String infoString = "(" + op2 + " " + s + " " + op1 + ")";
                    info.push(infoString);
                } else {
                    if (stack.size() == 1) {
                        resultField.setText("Not enough operands. Press C to try again.");
                        return;
                    }
                }
            }
        }
        if (stack.size() == 1) {
            resultField.setText(stack.pop().toString());
            operandField.setText(info.pop());
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}

