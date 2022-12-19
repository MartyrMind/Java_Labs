package practs.pract_8;

import java.util.Scanner;

public class _9 {

    public static int generate(int a, int b) {
        if (a > b + 1) return 0; // если нулей на два больше, то сформировать нельзя
        if (a == 0 || b == 0) return 1;
        return generate(a, b - 1) + generate(a - 1, b - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(); // 0
        int b = in.nextInt(); // 1
        System.out.println(generate(a, b));
    }
}
