package in.nexogen.collections.dequeExamples;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * Created by dv on 3/8/17.
 */
// It is a linear collection that supports element insertion and deletion at both end
// It is an acronym for double ended queue

// ArrayDeque provides facility of using deque and resizable array
// Inherits AbstractCollection class and implements Deque interface
// We can add or remove elements from both sides
// Null elements are not allowed
// Not thread safe, in the absence of external synchronization
// No capacity restriction
// Faster than LinkedList or Stack
// ArrayDeque --> extends ArrayCollection class and implements Deque interface --> extends Queue interface --> extends Collection interface --> extends Iterable interface
public class TestDeque {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Ravi");
        deque.add("Vijay");
        deque.add("Ajay");

        Iterator<String> iterator = deque.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
