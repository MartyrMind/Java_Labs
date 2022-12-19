package practs.pract_8;

import java.util.Scanner;

public class _13 {
    public static void print() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n != 0) System.out.println(n);
        if (n != 0) {
            int m = in.nextInt();
            if (m != 0) print();
        }
    }
    public static void main(String[] args) {
        print();
    }
}
