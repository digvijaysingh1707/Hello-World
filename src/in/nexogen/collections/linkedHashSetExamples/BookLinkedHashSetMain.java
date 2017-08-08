package in.nexogen.collections.linkedHashSetExamples;

import in.nexogen.collections.arrayListExamples.Book;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Created by dv on 3/8/17.
 */
public class BookLinkedHashSetMain {

    public static void main(String[] args) {
        LinkedHashSet<Book> set = new LinkedHashSet<Book>();

        Book book1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book book2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book book3=new Book(103,"Operating System","Galvin","Wiley",6);

        set.add(book1);
        set.add(book2);
        set.add(book3);

        Iterator<Book> iterator = set.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getId() + " " + book.getName() + " " + book.getAuthor() + " " + book.getPublisher() + " " + book.getQuantity());
        }
    }
}
