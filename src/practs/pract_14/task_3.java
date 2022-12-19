package practs.pract_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_3 {
    public static void main(String[] args) {
        String s = "If you invested 1 USD in the year 1801, you would have 18087791.41 USD today. " +
                "This is a 7.967 % return on investment. " +
                "But if you invested only 0.25 EUR in 1801, you would end up with 4521947.8525 EUR";

        Pattern p = Pattern.compile("([0-9]+(\\.[0-9]*)?\s(USD|EUR|RUB))");
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
