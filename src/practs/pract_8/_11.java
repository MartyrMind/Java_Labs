package practs.pract_8;

import java.util.Scanner;

public class _11 {
    public static int recursion() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n != 1 && n != 0) {
            return recursion();
        } else {
            if (n == 1) return recursion() + 1;
            else {
                int m = in.nextInt();
                if (m == 0) return 0;
                if (m == 1) return recursion() + 1;
                else return recursion();
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(recursion()); // вызов рекурсивной функции
    }
}
