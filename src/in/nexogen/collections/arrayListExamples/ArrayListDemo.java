package in.nexogen.collections.arrayListExamples;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by dv on 2/8/17.
 */

    //inherits AbstractList class and implements List interface
    //can contain duplicate elements
    //maintains insertion order
    //non synchronized
    //random access allowed
    //slower than array
    //List interface extends Collection Interface and Collection Interface extends Iterable
public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Digvijay");
        list.add("Vijay");
        list.add("Jai");
        list.add("Ranvijay");

        // Iterating elements through for each loop
        for (String s:list) {
            System.out.println(s);
        }

        System.out.println();

        // Iterating elements through Iterator
        Iterator iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

        System.out.println();

        //Student.java
        Student student1 = new Student(101, "Digvijay Singh", 20);
        Student student2 = new Student(102, "Ranvijay Singh", 14);
        Student student3 = new Student(103, "Vijay Singh", 22);

        ArrayList<Student> studentArrayList = new ArrayList<Student>();
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        Iterator iterator2 = studentArrayList.iterator();

        while (iterator2.hasNext()) {
            Student studentObject = (Student) iterator2.next();
            System.out.println(studentObject.getRollNo() + " " + studentObject.getName() + " " + studentObject.getAge());
        }

        System.out.println();

        // ArrayList addAll method
        ArrayList<String> arrayList1 = new ArrayList<String>();
        arrayList1.add("Ravi");
        arrayList1.add("Vijay");
        arrayList1.add("Ajay");

        // New ArrayList
        ArrayList<String> arrayList2 = new ArrayList<String>();
        arrayList2.add("Rohit");
        arrayList2.add("Dhirendra");

        // Adding arrayList2 in arrayList1
        arrayList1.addAll(arrayList2);

        Iterator iterator3 = arrayList1.iterator();

        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }

        System.out.println();
        System.out.println("Removing elements of arrayList3");
        System.out.println();

        // ArrayList removeAll method
        ArrayList<String> arrayList3 = new ArrayList<String>();
        arrayList3.add("Ravi");
        arrayList3.add("Dhirendra");
        arrayList1.removeAll(arrayList3);

        iterator3 = arrayList1.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }

        System.out.println();
        System.out.println("Retaining elements of arrayList1 and arrayList3");
        System.out.println();


        // ArrayList retainAll method
        arrayList1.addAll(arrayList2);
        arrayList1.remove(3);
        arrayList1.add(0, "Ravi");
        arrayList1.retainAll(arrayList3);

        iterator3 = arrayList1.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }


    }
}
