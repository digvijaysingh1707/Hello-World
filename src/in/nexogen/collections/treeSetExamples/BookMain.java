package in.nexogen.collections.treeSetExamples;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by dv on 3/8/17.
 */
public class BookMain {
    public static void main(String[] args) {
        Set<Book> set = new TreeSet<Book>();

        Book book1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);
        Book book2=new Book(233,"Operating System","Galvin","Wiley",6);
        Book book3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);

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
