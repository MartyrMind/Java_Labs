package practs.pract_18;

import java.util.Scanner;

public class task_4 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } finally {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        task_4 test = new task_4();
        test.exceptionDemo();
    }
}
