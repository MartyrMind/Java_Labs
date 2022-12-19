package practs.pract_8;

import java.util.Scanner;

public class _10 {
    public static int reverseNumber(int n, int pw) {
        //идея: на каждом шаге окусывать последнюю цифру и добавлять ее в новое число на место младшего разряда
        return (n==0) ? pw : reverseNumber(n/10, pw * 10 + n % 10);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.println(reverseNumber(n, 0));
    }
}
