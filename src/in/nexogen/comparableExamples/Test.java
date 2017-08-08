package in.nexogen.comparableExamples;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by dv on 4/8/17.
 */
public class Test {

    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Test(ArrayList<Test> list) {
        compareTo(list);
    }

    public Test (int num) {
        setNum(num);
    }

    public int compareTo(ArrayList<Test> list) {
        Test test;
        Iterator<Test> iterator = list.iterator();
        while (iterator.hasNext()) {
            test = iterator.next();
            if (test.getNum() > num)
                return -1;
            else if (test.getNum() == num)
                return 0;
            else
                return 1;
        }
        return 0;
    }
}
