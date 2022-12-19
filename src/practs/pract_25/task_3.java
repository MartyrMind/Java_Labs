package practs.pract_25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_3 {
    public static boolean validateIP(String ip) {
        String num_regex = "(\\d{1,2}|1\\d{2}|2[0-4]\\d|25[0-5])";
        String regex = String.format("^%s\\.%s\\.%s\\.%s$", num_regex, num_regex, num_regex, num_regex);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(ip);
        return m.matches();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ip = in.nextLine();
        while(!ip.equals("0.0.0.0")) {
            System.out.println(validateIP(ip));
            ip = in.nextLine();
        }
    }
}
