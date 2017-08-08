package in.nexogen.collections.queueExamples;

import in.nexogen.collections.treeSetExamples.Book;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by dv on 3/8/17.
 */
public class BookMain {
    public static void main(String[] args) {
        Queue<Book> queue = new PriorityQueue<Book>();

        Book book1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);
        Book book2=new Book(233,"Operating System","Galvin","Wiley",6);
        Book book3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);

        queue.add(book1);
        queue.add(book2);
        queue.add(book3);

        System.out.println("Traversing the queue elements: ");
        System.out.println();

        Iterator<Book> iterator = queue.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getId() + " " + book.getName() + " " + book.getAuthor() + " " + book.getPublisher() + " " + book.getQuantity());
        }

        queue.remove();

        System.out.println();
        System.out.println("After removing one Book record: ");
        System.out.println();

        iterator = queue.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getId() + " " + book.getName() + " " + book.getAuthor() + " " + book.getPublisher() + " " + book.getQuantity());
        }
    }
}
