package practs.pract_11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите дату dd.MM.yyyy: ");
        String input = in.nextLine();
        Date date1 = new SimpleDateFormat("dd.MM.yyyy").parse(input);

        System.out.println("Введите часы и минуты: HH:mm");
        String[] time = in.nextLine().split(":");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(time[0]));
        calendar.set(Calendar.MINUTE, Integer.parseInt(time[1]));

        System.out.println(date1.toString());
        System.out.println(calendar.getTime());
    }
}

