package practs.pract_14;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату:");
        String date = in.nextLine();

        Pattern p = Pattern.compile("^([0-9]{2}/[0-9]{2}/[0-9]{4})$");
        Matcher m = p.matcher(date);
        if (m.find()) {
            System.out.println("Дата введена верно");
        } else {
            System.out.println("Дата введена неверно");
        }
    }
}
