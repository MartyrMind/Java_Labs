package sems.sem_08_09;

import java.util.Scanner;

public class _1 {

    public static void main(String[] args) {
        /*
        На вход два числа, первое - длина серии чисел фиббоначи
        второе - с какого элемента
         */
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int len = in.nextInt();
        int from = in.nextInt();
        for(int i = 0; i < len + from; i++) {
            int c = a + b;
            b = a;
            a = c;
            if (i >= from - 1) {
                System.out.println(a);
            }
        }

    }
}
