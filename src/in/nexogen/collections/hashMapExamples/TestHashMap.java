package in.nexogen.collections.hashMapExamples;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by dv on 3/8/17.
 */

// HashMap implements the Map interface by using a hash table
// Inherits AbstractMap class and implements Map interface
// Contains values based on keys
// Contains only unique elements
// It may have one null key and multiple null values
// Maintains no order
public class TestHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(100, "Amit");
        map.put(101, "Jai");
        map.put(102, "Vijay");

        System.out.println(map);
        System.out.println();

        map.remove(101);

        System.out.println(map);

    }
}
