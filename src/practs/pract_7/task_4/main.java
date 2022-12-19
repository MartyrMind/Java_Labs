package practs.pract_7.task_4;

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

    public static void printMagazines(Printable[] printables) {
        for (var printable : printables) {
            if (printable instanceof Journal) {
                printable.print();
            }
        }
    }

    public static void printBooks(Printable[] printables) {
        for (var printable : printables) {
            if (printable instanceof Book) {
                printable.print();
            }
        }
    }


    public  static void main(String[] args) {
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
        Printable [] printables = new Printable[items.size()];
        printables = items.toArray(printables);
        System.out.println("Содержимое: ");
        System.out.println("    Books:");
        System.out.println("---------------------------");
        printBooks(printables);
        System.out.println("---------------------------");
        System.out.println("    Magazines:");
        System.out.println("---------------------------");
        printMagazines(printables);
    }
}
