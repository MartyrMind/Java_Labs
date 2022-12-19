package practs.pract_8;

import java.util.Scanner;

public class _14 {
    public static String newFormat(int n) {
        if (n < 10) return Integer.toString(n); //случай цифры
        else return newFormat(n / 10) + " " + n % 10; //передали вниз число без младешго разряда, который выведем при выходе
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(newFormat(n));
    }
}
