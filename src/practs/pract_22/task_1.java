package practs.pract_22;

import java.util.Scanner;
import java.util.Stack;

public class task_1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Stack<String> info = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");
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
                                System.out.println("Division by zero");
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
                    break;
                }
            }
        }
        Number res = stack.pop();
        System.out.println(res);
        System.out.println(info.pop() + " = " + res);
    }
}
