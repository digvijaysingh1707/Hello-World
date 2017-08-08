package in.nexogen.collections.hashMapExamples;

import in.nexogen.collections.arrayListExamples.Book;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by dv on 3/8/17.
 */
public class BookHashMapMain {
    public static void main(String[] args) {
        Map<Integer, Book> map = new HashMap<Integer, Book>();

//        Book book1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
//        Book book2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
//        Book book3=new Book(103,"Operating System","Galvin","Wiley",6);

//        map.put(1, book1);
//        map.put(2, book2);
//        map.put(3, book3);

        map.put(1, new Book(101,"Let us C","Yashwant Kanetkar","BPB",8));
        map.put(2, new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4));
        map.put(3, new Book(103,"Operating System","Galvin","Wiley",6));

        Iterator iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry)iterator.next();
//            int key = (int) mapEntry.getKey();
//            Book book = (Book) mapEntry.getValue();
            System.out.println("Key --> " + (int)mapEntry.getKey() + " details --> " + ((Book)mapEntry.getValue()).getId() + " " + ((Book)mapEntry.getValue()).getName() + " "
                    + ((Book)mapEntry.getValue()).getAuthor() + " " + ((Book)mapEntry.getValue()).getPublisher() + " " + ((Book)mapEntry.getValue()).getQuantity());
        }
    }
}
