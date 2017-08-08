package in.nexogen.collections.hashSetExamples;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by dv on 3/8/17.
 */

// Used to create a collection that uses a hash table for storage
// It inherits the AbstractSet class and implements Set interface
// Elements are stored by a mechanism called hashing
// HashSet contains unique elements only that is no duplicate elements
// HashSet --> extends AbstractSet class and implements Set interface --> extends Collection interface --> extends Iterable interface
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Ravi");
        hashSet.add("Vijay");
        hashSet.add("Ravi");
        hashSet.add("Ajay");
        hashSet.add("Vivek");
        hashSet.add("Viraj");
        hashSet.add("Virat");

        System.out.println(hashSet);

//        Iterator<String> iterator = hashSet.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }
}
