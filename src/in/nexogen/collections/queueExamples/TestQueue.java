package in.nexogen.collections.queueExamples;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Created by dv on 3/8/17.
 */

// Orders the element in FIFO manner
// PriorityQueue provides the facility of using queue
// Does not order the element in FIFO manner
// inherits AbstractQueue class

public class TestQueue {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Amit");
        queue.add("Vijay");
        queue.add("Karan");
        queue.add("Jai");
        queue.add("Rahul");

        System.out.println("Head --> " + queue.element());
        System.out.println("Head --> " + queue.peek());
        System.out.println();
        System.out.println("Iteraring the queue elements: ");
        System.out.println();

        Iterator<String> iterator = queue.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        queue.remove();
        queue.poll();

        System.out.println();
        System.out.println("After removing two elements: ");
        System.out.println();
        iterator = queue.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}