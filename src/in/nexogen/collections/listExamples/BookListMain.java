package in.nexogen.collections.listExamples;

import in.nexogen.collections.arrayListExamples.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by dv on 3/8/17.
 */
public class BookListMain {

    public static void main(String[] args) {


        List<Book> bookList = new ArrayList<Book>();

        Book book1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book book2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book book3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        ListIterator<Book> listIterator = bookList.listIterator();

        System.out.println("Traversing list in forward direction");
        System.out.println();

        while (listIterator.hasNext()) {
            Book book = listIterator.next();
            System.out.println(book.getId() + " " + book.getName() + " " + book.getAuthor() + " " + book.getPublisher() + " " + book.getQuantity());
        }

        System.out.println();
        System.out.println("Traversing list in backward direction");
        System.out.println();

        while (listIterator.hasPrevious()) {
            Book book = listIterator.previous();
            System.out.println(book.getId() + " " + book.getName() + " " + book.getAuthor() + " " + book.getPublisher() + " " + book.getQuantity());
        }
    }
}
