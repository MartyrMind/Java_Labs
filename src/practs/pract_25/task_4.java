package practs.pract_25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_4 {
    public static void main(String[] args) {
//        Pattern p = Pattern.compile("\\([^()]*\\)");
        Pattern p = Pattern.compile("(\\([^()]*(\\d+(\\+|\\-|\\*|\\/))*\\d*\\))(\\+|\\-|\\*\\/)?");
        Matcher m;
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        while ((m = p.matcher(s)).find())
            s = m.replaceAll("");
        System.out.println((s.contains("(") || s.contains(")") ? "Неверное выражение" : "Верное выражение"));
    }
}
