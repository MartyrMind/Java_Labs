package sems.sem_01_09;

import java.util.Scanner;

public class _1 {
    public static void main(String[] args) {
        //cумма элементов целочисленного массива
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] Array = new int[n];

        int sum_for = 0;
        int sum_while = 0;
        int sum_do_while = 0;
        int i = 0;

        for (i = 0; i < n; i++) {
            Array[i] = in.nextInt();
            sum_for += Array[i];
        }

        i = 0;
        while (i < n) {
            sum_while += Array[i];
            i += 1;
        }

        i = 0;
        do {
            sum_do_while += Array[i];
            i += 1;
        } while (i < n);

        System.out.println(sum_for);
        System.out.println(sum_while);
        System.out.println(sum_do_while);
    }
}
