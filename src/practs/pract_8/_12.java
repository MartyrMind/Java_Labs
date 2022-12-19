package practs.pract_8;

import java.util.Scanner;

public class _12 {
    public static void print() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n % 2 != 0) System.out.print(n + " ");
        if (n != 0) print();
    }
    public static void main(String[] args) {
        print();
    }
}
