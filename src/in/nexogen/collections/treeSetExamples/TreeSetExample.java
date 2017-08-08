package in.nexogen.collections.treeSetExamples;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by dv on 3/8/17.
 */

// Implements Set Interface that uses tree for storage
// Inherits AbstractSet class and implements NavigableSet interface
// Objects of TreeSet class are stored in ascending order
// Contains unique elements like HashSet
// Access and retrieval time are quite fast
// TreeSet --> extends AbstractSet class and implements NavigableSet interface --> extends SortedSet interface --> extends Set interface --> extends Collection interface --> extends Iterable interface
public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<String>();

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
