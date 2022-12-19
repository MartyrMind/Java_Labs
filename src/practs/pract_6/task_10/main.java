package practs.pract_6.task_10;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку для манипуляций: ");
        String s = in.nextLine();
        Editor editor = new Editor(new StringBuilder(s));

        editor.events.subscribe("append", new AppendListener());
        editor.events.subscribe("reverse", new ReverseListener());
        editor.events.subscribe("replace", new ReplaceListener());

        System.out.println("Тестирование операции присоединения");
        System.out.println("Введите строку: ");
        String addition = in.nextLine();
        editor.append(addition);

        System.out.println("Тестирование операции переворота строки: ");
        editor.reverse();
        editor.reverse();

        System.out.println("Тестирование операции вставки");
        System.out.println("Введите строку");
        addition = in.nextLine();
        System.out.print("Введите индекс начала и конца вставки: ");
        editor.replace(in.nextInt(), in.nextInt(), addition);
    }
}
