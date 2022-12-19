package practs.pract_14;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        String pattern = "abcdefghijklmnopqrstuv18340";
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of strings: ");
        int n = in.nextInt();
        in.nextLine();
        for(int i = 0; i < n; i++) {
            System.out.print("Enter string: ");
            String s = in.nextLine();
            System.out.println("Result: " + s.matches(pattern));
        }
    }
}
