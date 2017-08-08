package in.nexogen.collections;

import java.util.Hashtable;
import java.util.Vector;

/**
 * Created by dv on 2/8/17.
 */
public class TestCollection {

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4};
        Vector<Integer> v = new Vector<>();
        Hashtable<Integer, String> h = new Hashtable<>();

        //adding element in vector
        v.addElement(1);
        v.addElement(2);

        //adding element in hashtable
        h.put(1, "Digvijay ");
        h.put(2, "Singh");

        System.out.println(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]);
        System.out.println(v.elementAt(0) + " " + v.elementAt(1));
        System.out.println(h.get(1) + h.get(2));


    }
}
