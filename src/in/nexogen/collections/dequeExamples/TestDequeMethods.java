package in.nexogen.collections.dequeExamples;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/**
 * Created by dv on 3/8/17.
 */
public class TestDequeMethods {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.offer("Arvind");
        deque.offer("Vimal");
        deque.add("Mukul");

        System.out.println();
        System.out.println("Elements of deque are: ");

        Iterator<String> iterator = deque.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        deque.offerFirst("Jai");

        System.out.println();
        System.out.println("After offerFirst() traversal: ");
        System.out.println();

        iterator = deque.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        deque.offerLast("Vivek");

        System.out.println();
        System.out.println("After offerLast() traversal: ");
        System.out.println();

        iterator = deque.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        deque.poll();

        System.out.println("After poll(): ");
        System.out.println();

        iterator = deque.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        deque.pollFirst();

        System.out.println("After pollFirst(): ");
        System.out.println();

        iterator = deque.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        deque.pollLast();

        System.out.println("After pollLast(): ");
        System.out.println();

        iterator = deque.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
