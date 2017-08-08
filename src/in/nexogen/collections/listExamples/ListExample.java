package in.nexogen.collections.listExamples;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by dv on 3/8/17.
 */
public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Amit");
        list.add("Vijay");
        list.add("Kumar");
        list.add(1, "Sachin");

        System.out.println("Element at second position: " + list.get(2));
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
