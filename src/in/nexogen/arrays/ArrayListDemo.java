package in.nexogen.arrays;


import java.util.ArrayList;

/**
 * Created by dv on 1/8/17.
 */

    // ArrayList inherits AbstractList class and implements List Interface
    // It is initialised by a size, can increase or decrease its size as required
    // Allow random access of list
    // Cannot be used for primitives types, rather used with wrapper class
public class ArrayListDemo {
    public static void main(String[] args) {
//        //size of arraylist
//        int n = 5;
//
//        //declaring arraylist with initial size n
//        ArrayList<Integer> arrayList = new ArrayList<Integer>(n);
//
//        //appending the new element at the end of the list
//        for (int i = 1; i <= n ; i++) {
//            arrayList.add(i);
//        }
//
//        //printing elements
//        System.out.println(arrayList);
//
//        //removing element at index 3
//        arrayList.remove(3);
//
//        //displaying arraylist after deletion
//        System.out.println(arrayList);
//
//        //printing element one by one
//        for (Integer it: arrayList) {
//            System.out.print(it + " ");
//
//        }





        //Creating list of books
        ArrayList<Book> bookArrayList = new ArrayList<Book>();

        System.out.println();
        System.out.println("Inserting Books");
        System.out.println();

        //Creating Books
        Book book1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB",8);
        Book book2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill",4);
        Book book3 = new Book(103, "Operating System", "Galvin", "Wiley",6);

        //Adding Books to list
        bookArrayList.add(book1);
        bookArrayList.add(book2);
        bookArrayList.add(book3);

        //Traversing List
        for(Book b:bookArrayList){
            System.out.println(b.getId() + " " + b.getName() + " " + b.getAuthor() + " " + b.getPublisher() + " " + b.getQuantity());
        }

        System.out.println();
        System.out.println("Removing a Book");
        System.out.println();

        //Removing a Book
        bookArrayList.remove(book2);

        //Traversing again
        for (Book b: bookArrayList) {
            System.out.println(b.getId() + " " + b.getName() + " " + b.getAuthor() + " " + b.getPublisher() + " " + b.getQuantity());
        }
    }
}
