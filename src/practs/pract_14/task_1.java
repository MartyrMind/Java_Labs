package practs.pract_14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_1 {
    public static void main(String[] args) {
        String s = "A blockchain, originally block chain " +
                "is a growing list of records, called blocks " +
                "which are linked using cryptography";


        Pattern p = Pattern.compile("b...k");
        Matcher m = p.matcher(s);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
