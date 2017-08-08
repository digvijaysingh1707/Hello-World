package in.nexogen.collections.linkedListExamples;

import in.nexogen.collections.arrayListExamples.Book;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by dv on 2/8/17.
 */
public class BookMain {

    public static void main(String[] args) {
        List<Book> list = new LinkedList<Book>();
        Book book1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book book2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book book3=new Book(103,"Operating System","Galvin","Wiley",6);

        list.add(book1);
        list.add(book2);
        list.add(book3);

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getId() + " " + book.getName() + " " + book.getAuthor() + " " + book.getPublisher() + " " + book.getQuantity());
        }
    }
}
