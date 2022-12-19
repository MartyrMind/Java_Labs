package practs.pract_14;

import java.util.Scanner;

public class task_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пароль:");
        String password = in.nextLine();
        //check password
        if (password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}$")) {
            System.out.println("Пароль сильный");
        } else {
            System.out.println("Пароль слабый");
        }
    }
}
