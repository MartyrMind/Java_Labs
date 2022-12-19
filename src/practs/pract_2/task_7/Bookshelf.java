package practs.pract_2.task_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import static java.util.Collections.max;
import static java.util.Collections.min;

public class Bookshelf {
    private ArrayList<Book> books = new ArrayList<Book>();
    private int numberOfBooks;

    public Bookshelf(ArrayList<Book> books, int numberOfBooks) {
        this.books = books;
        this.numberOfBooks = numberOfBooks;
    }

    public Book newestBook() {
        return max(books, Comparator.comparingInt(Book::getPublicationDate));
    }
    public Book oldestBook() {
        return min(books, Comparator.comparingInt(Book::getPublicationDate));
    }
    public void sort() {
        books.sort(Comparator.comparing(Book::getPublicationDate));
    }


    @Override
    public String toString() {
        return "Bookshelf{" +
                "books=" + books +
                '}';
    }
}