package practs.pract_2.task_7;

import java.util.ArrayList;
import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Количество книг на полке: ");
        int n = in.nextInt();
        in.nextLine();
        ArrayList<Book> books = new ArrayList<Book>();
        for(int i = 0; i < n; i++) {
            System.out.println("Название, автор и год издания " + (i + 1) + "-ой книги:");
            String[] value = in.nextLine().split(" ");
            books.add(new Book(value[0], value[1], Integer.parseInt(value[2])));
        }
        Bookshelf bookshelf = new Bookshelf(books, n);
        System.out.println("Самая старая книга: " + bookshelf.oldestBook());
        System.out.println("Самая новая книга: " + bookshelf.newestBook());
        System.out.println("Книги в отсортированном порядке: ");
        bookshelf.sort();
        System.out.println(bookshelf);
    }
}
