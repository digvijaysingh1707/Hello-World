package in.nexogen.collections.hashSetExamples;

import in.nexogen.collections.arrayListExamples.Book;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by dv on 3/8/17.
 */
public class BookHashSetMain {

    public static void main(String[] args) {


        HashSet<Book> hashSet = new HashSet<Book>();

        Book book1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
        Book book2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
        Book book3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);

        hashSet.add(book1);
        hashSet.add(book2);
        hashSet.add(book3);

        Iterator<Book> iterator = hashSet.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getId() + " " + book.getName() + " " + book.getAuthor() + " " + book.getPublisher() + " " + book.getQuantity());
        }
    }
}
