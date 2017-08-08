package in.nexogen.collections.dequeExamples;

import in.nexogen.collections.arrayListExamples.Book;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * Created by dv on 3/8/17.
 */
public class BookMain {
    public static void main(String[] args) {

        Deque<Book> deque = new ArrayDeque<Book>();

        Book book1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book book2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book book3=new Book(103,"Operating System","Galvin","Wiley",6);

        deque.add(book1);
        deque.add(book2);
        deque.add(book3);

        Iterator<Book> iterator = deque.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getId() + " " + book.getName() + " " + book.getAuthor() + " " + book.getPublisher() + " " + book.getQuantity());
        }
    }
}
