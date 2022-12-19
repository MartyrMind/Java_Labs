package practs.pract_13;

import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Telephone number: ");
        String dt = in.nextLine();
        dt = dt.substring(dt.length() - 10);
        StringBuilder number = new StringBuilder("+7").append(dt.substring(0, 3)).append("-").append(dt.substring(3, 6)).append("-").append(dt.substring(6));
        System.out.println(number.toString());
    }
}
