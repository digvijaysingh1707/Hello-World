package in.nexogen.comparatorExamples;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by dv on 4/8/17.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        arrayList.add(new Student(111,"bbbb", "london"));
        arrayList.add(new Student(131,"aaaa", "nyc"));
        arrayList.add(new Student(121,"cccc", "jaipur"));

        System.out.println("Unsorted : ");
        System.out.println();
        for (Student student: arrayList) {
            System.out.println(student.toString());
        }

        Collections.sort(arrayList, new SortByRoll());

        System.out.println();
        System.out.println("Sorted by Roll No : ");
        System.out.println();
        for (Student student: arrayList) {
            System.out.println(student.toString());
        }

        Collections.sort(arrayList, new SortByName());

        System.out.println();
        System.out.println("Sorted by Name : ");
        System.out.println();
        for (Student student: arrayList) {
            System.out.println(student.toString());
        }

    }
}
