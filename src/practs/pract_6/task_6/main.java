package practs.pract_6.task_6;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static Book createBook(Scanner in) {
        System.out.print("Введите название книги: ");
        String title = in.nextLine();
        System.out.print("И ее автора: ");
        return new Book(title, in.nextLine());
    }

    public static Journal createJournal(Scanner in) {
        System.out.print("Введите название журнала: ");
        String title = in.nextLine();
        System.out.print("И дату выпуска: ");
        return new Journal(title, in.nextLine());
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов: ");
        int n = in.nextInt();

        ArrayList<Printable> items = new ArrayList<Printable>();
        for(int i = 0; i < n; i++) {
            System.out.print("Книга (0) или Журнал? (1): ");
            int choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 0:
                    items.add(createBook(in));
                    break;
                case 1:
                    items.add(createJournal(in));
            }
        }
        Printable shop = new Shop(items);
        System.out.println("Содержимое: ");
        System.out.println("---------------------------");
        shop.print();
    }
}
