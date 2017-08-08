package in.nexogen.collections.listExamples;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by dv on 3/8/17.
 */
public class TestListIterator {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Amit");
        list.add("Vijay");
        list.add("Kumar");
        list.add(1, "Sachin");

        System.out.println("Element at position 2 is : " + list.get(2));

        System.out.println();

        ListIterator<String> listIterator = list.listIterator();

        System.out.println("Traversing List in forward direction");
        System.out.println();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println();
        System.out.println("Traversing List in backward direction");
        System.out.println();

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }

    }
}
