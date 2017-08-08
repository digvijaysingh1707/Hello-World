package in.nexogen.comparableExamples;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by dv on 4/8/17.
 */
public class MainTest {
    public static void main(String[] args) {
        ArrayList<Test> list = new ArrayList<Test>();
        list.add(new Test(5));
        list.add(new Test(2));
        list.add(new Test(6));
        list.add(new Test(1));
        list.add(new Test(3));
        list.add(new Test(9));
        list.add(new Test(7));

        System.out.println("List is : ");

        Iterator<Test> iterator = list.iterator();

        for (int i = 0; i < list.size() && iterator.hasNext(); i++) {
            Test test = iterator.next();
            System.out.println(i + " --> " + test.getNum());
        }

        new Test(list);
    }
}
