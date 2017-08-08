package in.nexogen.collections.mapExamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by dv on 3/8/17.
 */
public class TestNonGenericMap {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put(1, "Amit");
        map.put(5, "Rahul");
        map.put(2, "Jai");
        map.put(6, "Amit");

        Iterator iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry mapEntry = (Map.Entry) iterator.next();
            System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
        }
    }
}
