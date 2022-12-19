package practs.pract_2.task_1;

import practs.pract_2.task_1.Author;

import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        //ввод данных
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите email: ");
        String email = in.nextLine();
        System.out.print("Введите запасной email: ");
        String addEmail = in.nextLine();
        System.out.print("Введите пол (m/f): ");
        char gender = in.next().charAt(0);

        //создание класса и его тестирование
        Author author = new Author(name, email, gender);
        System.out.println("toString(): " + author); //тестирование toString()

        System.out.println("Геттеры: " + //тестирование геттеров
                "\n\tИмя: " + author.getName() +
                "\n\tПочта: " + author.getEmail() +
                "\n\tПол: " + author.getGender());

        author.setEmail(addEmail); //тестирование сеттера
        System.out.println("Новый email: " + author.getEmail());

    }
}
