package practs.pract_8;

import java.util.Scanner;

public class _17 {
    public static int maximum() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) return 0;
        else return Math.max(n, maximum());
    }

    public static void main(String[] args) {
        System.out.println(maximum());
    }
}
