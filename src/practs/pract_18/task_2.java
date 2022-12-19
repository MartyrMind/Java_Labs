package practs.pract_18;

import java.util.Scanner;

public class task_2 {
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
        }
    }

    public static void main(String[] args) {
        task_2 test = new task_2();
        test.exceptionDemo();
    }
}
