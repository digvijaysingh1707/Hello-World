package in.nexogen.collections.linkedHashSetExamples;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Created by dv on 3/8/17.
 */

// LinkedHashSet class is a Hash Table and Linked List implementation of set interface
// It inherits HashSet class and implements Set interface
// Contains unique elements like HashSet
// Provides all optional set operation and permits null elements
// Maintains insertion order
// LinkedHashSet --> extends HashSet and rest same
public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet<String>();

        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
