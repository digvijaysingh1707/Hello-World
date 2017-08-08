package in.nexogen.collections.linkedHashMapExamples;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by dv on 3/8/17.
 */

// It is a hash table and Linked List implementation of Map interface, with predictable iteration order
// It inherits HashMap class and implements Map interface
// Contains value based on the keys
// Contains unique elements
// May have one null key and multiple null values
// Same as HashMap instead it maintains insertion order
// LinkedHashMap --> extends HashMap --> extends AbstractMap --> implements Map
public class TestLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

        linkedHashMap.put(100, "Amit");
        linkedHashMap.put(101, "Vijay");
        linkedHashMap.put(102, "Rahul");

//        System.out.println(linkedHashMap);
        Iterator iterator = linkedHashMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) iterator.next();
            System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
        }

        linkedHashMap.remove(101);

        System.out.println();
//        System.out.println(linkedHashMap);

        iterator = linkedHashMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) iterator.next();
            System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
        }
    }
}
