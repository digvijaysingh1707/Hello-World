package in.nexogen.collections.arrayListExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by dv on 2/8/17.
 */
public class BookMain {
    public static void main(String[] args) {

        trycatchexample();
//        int a [] = new int[]{1, 2, 3};
//        System.out.println(a[6]);
//        String abc = "hkjhkkjhkjhk";
//        System.out.println(abc.substring(9));
//
//        switchCaseResult();
//        List<Book> bookList = new ArrayList<Book>();
//
//        Book book1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
//        Book book2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
//        Book book3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);
//
//        bookList.add(book1);
//        bookList.add(book2);
//        bookList.add(book3);
//
//        Iterator iterator = bookList.iterator();
//
//        while (iterator.hasNext()) {
//            Book bookObj = (Book) iterator.next();
//            System.out.println(bookObj.getId() + " " + bookObj.getName() + " " + bookObj.getAuthor() + " " + bookObj.getPublisher() + " " + bookObj.getQuantity());
//        }
    }

    private static void trycatchexample(){
        Book book = null;
        try {
            System.out.println(book.getId());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Finally called");
        }
        System.out.println("HELLO WORLD");
    }

    private static void switchCaseResult() {
        final int A = 12;
        switch (A){
            case 11:
            case 13:
                System.out.println("I was printed");
            case 12:
                System.out.println("HELLO");
            case 14:
                System.out.println("Jelly");

        }
    }
}