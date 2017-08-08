package in.nexogen.collections.linkedListExamples;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by dv on 2/8/17.
 */

// uses doubly linked list to store elements i.e. we can add and remove elements from both sides
// provides a linked list data structure
// inherits AbstractSequentialList class and implements List and Deque interfaces
// can contain duplicate elements
// maintains insertion order
// non synchronized
// faster than ArrayList because no shifting needs to occur
// can be used as list, stack or queue
// Deque extends Queue Interface
// List and Queue Interfaces further extends Collection Interface
// Collection extends Iterable interface
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Raj");
        list.add("Rohit");
        list.add("Vivek");


        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n Size of list now is -> " + list.size());

        // Adding to starting of the linked list

        System.out.println();

        list.addFirst("Digvijay");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n Size of list now is -> " + list.size());

        // Adding to the last of the Linked List

        System.out.println();

        list.addLast("Ranvijay");
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n Size of list now is -> " + list.size());

        //Creating new Linked List
        List<String> list1 = new LinkedList<String>();

        list1.add("Ali");
        list1.add("Kushagra");
        list1.add("Rishabh");
        list1.add("Rohit");

        //Adding list1 to list

        list.addAll(list1);
        iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\n Size of list now is -> " + list.size());

        //getting first and last element

        System.out.println();

        System.out.println("First element -> " + list.getFirst() + "\nLast element -> " + list.getLast());

        //indexOf method of Linked List

        System.out.println();

        System.out.println("Index of Digvijay is -> " + list.indexOf("Digvijay") + "\nIndex of Ranvijay is -> " + list.indexOf("Ranvijay"));
    }
}
