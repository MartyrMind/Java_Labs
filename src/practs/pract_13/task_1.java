package practs.pract_13;

import java.util.Scanner;

public class task_1 {
    public static void printArgs(String arg) {
        System.out.println(arg);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = in.nextLine();
        printArgs(input);

        System.out.println("Введите строку для манипуляций: ");
        String input2 = in.nextLine();
        System.out.println("Последний символ строки: " + input2.charAt(input2.length() - 1));

        System.out.println("Введите строку: ");
        System.out.println("Строка оканчивается на \"!!!\": " + in.nextLine().endsWith("!!!"));

        System.out.println("Введите строку: ");
        System.out.println("Строка начинается на \"I like\": " + in.nextLine().startsWith("I like"));

        System.out.println("Введите строку: ");
        System.out.println("Строка содержит \"Java\": " + in.nextLine().contains("Java"));

        String s = "I like Java!!!";
        System.out.println("Позиция подстроки \"Java\" в строке \"I like Java\": " + s.indexOf("Java"));

        System.out.println("Введите строку: ");
        String input3 = in.nextLine();
        System.out.println("Строка с заменой a на o: " + input3.replace('a', 'o'));

        System.out.println("Введите строку: ");
        String input4 = in.nextLine();
        System.out.println("Строка в верхнем регистре: " + input4.toUpperCase());
        System.out.println("Строка в нижнем регистре: " + input4.toLowerCase());

        int st = s.indexOf("Java");
        int en = "Java".length();
        System.out.println(s.substring(st, st + en));
    }
}
