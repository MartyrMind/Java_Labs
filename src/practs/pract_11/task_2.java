package practs.pract_11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Math.abs;

public class task_2 {
    public static int cnv(String s) {
        return Integer.parseInt(s);
    }

    public static boolean compareDates(Date date1, Date date2) {
        return date1.getDate() == date2.getDate() && date1.getMonth() == date2.getMonth() && date1.getYear() == date2.getYear();
    }
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дату (dd.mm.yyyy): ");
        String input = in.nextLine();
        Date date1 = new SimpleDateFormat("dd.MM.yyyy").parse(input);

        Date date2 = new Date();

        System.out.println("Сравнение дат:");
        System.out.println(compareDates(date1, date2));
    }
}
