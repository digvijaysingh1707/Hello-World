package in.nexogen.collections.linkedListExamples;

import java.util.LinkedList;

/**
 * Created by dv on 2/8/17.
 */
public class TestLinkedList {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<String>();

        list.add("A");
        list.add("B");
        list.addLast("C");
        list.addFirst("D");
        list.add(2, "E");
        list.add("F");
        list.add("G");

        System.out.println("Linked List is -> " + list);

        list.remove("B");
        list.remove(3);
        list.removeFirst();
        list.removeLast();
        System.out.println("Linked List after deletion ->" + list);

        boolean status = list.contains("E");

        if (status)
            System.out.println("List contains E");
        else
            System.out.println("List does not contains E");

        int size = list.size();
        System.out.println("Size of linked list is -> " + size);

        Object element = list.get(2);
        System.out.println("Element returned by get() -> " + element);

        list.set(2, "Y");
        System.out.println("Linked List after change -> " + list);
    }
}
