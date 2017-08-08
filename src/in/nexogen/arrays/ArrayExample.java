package in.nexogen.arrays;

import java.util.ArrayList;

/**
 * Created by dv on 1/8/17.
 */
public class ArrayExample {


    private static ArrayList<Student> values = new ArrayList<>();

    public static void main(String [] args){
        Student st1 = new Student("A", 21, Constants.Gender.MALE);
        Student st2 = new Student("B", 23, Constants.Gender.FEMALE);
        Student st3 = new Student("C", 11, Constants.Gender.MALE);
        Student st4 = new Student("D", 51, Constants.Gender.FEMALE);

       values.add(st1);
       values.add(st2);
       values.add(st3);
       values.add(st4);

        for (Student s: values) {
            System.out.println(s);

        }
    }
}
