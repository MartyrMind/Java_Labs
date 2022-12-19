package practs.pract_11;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class task_1 {
    public static int cnv(String s) {
        return Integer.parseInt(s);
    }
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите фамилию разработчика: ");
        String surname = in.nextLine();

        System.out.print("Введите дату и время получения задания (dd.mm.yyyy hh:mm) ");
        String input = in.nextLine();
        Date date1 = new SimpleDateFormat("dd.MM.yyyy HH:mm").parse(input);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm");
        System.out.println("Время получения задания: " + sdf.format(date1));
        System.out.println("Время завершения задания: " + sdf.format(new Date()));
    }
}
