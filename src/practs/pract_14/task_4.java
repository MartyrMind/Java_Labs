package practs.pract_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_4 {
    public static void main(String[] args) {
        String s1 = "(3 + 5) – 9 × 4";
        String s2 = "2 * 9 – 6 × 5";

        Pattern p = Pattern.compile("[0-9]+\s*[+]");
        System.out.println(p.matcher(s1).find());
        System.out.println(p.matcher(s2).find());

    }
}
