package practs.pract_6.task_9;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Object> cmds = new ArrayList<Object>();
        System.out.println("Введите строку для манипуляций: ");
        String s = in.nextLine();
        StringBuilder builder = new StringBuilder(s);

        System.out.println("Добавление новой строки. Введите текст: ");
        AppendCommand appendCommand = new AppendCommand(new StringBuilder(s));
        String addition = in.nextLine();
        cmds.add(addition);
        s = appendCommand.execute(cmds);
        System.out.println(s);
        s = appendCommand.undo();
        System.out.println(s);

        System.out.println("Переворот строки");
        ReverseCommand reverseCommand = new ReverseCommand(new StringBuilder(s));
        s = reverseCommand.execute(cmds);
        System.out.println(s);
        s = reverseCommand.undo();
        System.out.println(s);

        System.out.println("Тестирование команды replace");
        ReplaceCommand replaceCommand = new ReplaceCommand(new StringBuilder(s));
        System.out.println("Введите индексы начала и конца вставки");
        int start = in.nextInt();
        int end = in.nextInt();
        in.nextLine();
        System.out.println("Введите строку");
        addition = in.nextLine();
        cmds.clear();
        cmds.add(start);
        cmds.add(end);
        cmds.add(addition);
        s = replaceCommand.execute(cmds);
        System.out.println(s);
        s = replaceCommand.undo();
        System.out.println(s);


    }
}
