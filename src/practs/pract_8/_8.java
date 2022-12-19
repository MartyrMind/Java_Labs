package practs.pract_8;

import java.util.Scanner;

public class _8 {
    //write recursive palindrome function
    public static boolean isPalindrome(String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        System.out.println(isPalindrome(str) ? "Строка является палиндромом" : "Строка не является палиндромом");
    }
}
