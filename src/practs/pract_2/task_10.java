package practs.pract_2;

import java.util.Scanner;

public class task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String s = scanner.nextLine();
        System.out.println("Количество слов: " + s.split(" ").length);
    }
}
