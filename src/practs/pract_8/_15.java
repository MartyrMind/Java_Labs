package practs.pract_8;

import java.util.Scanner;

public class _15 {
    public static String newFormat(int n) {
        if (n < 10) return Integer.toString(n);
        System.out.print(n % 10 + " ");
        return newFormat(n / 10);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(newFormat(n));
    }
}
