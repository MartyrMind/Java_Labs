package practs.pract_14;

import java.util.Scanner;
import java.util.regex.Pattern;

public class task_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите email:");
        String email = in.nextLine();
        //check email
        Pattern p = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
        if (p.matcher(email).find()) {
            System.out.println("Email введен верно");
        } else {
            System.out.println("Email введен неверно");
        }
    }
}
