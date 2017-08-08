package in.nexogen.comparatorExamples;

import java.util.Comparator;

/**
 * Created by dv on 4/8/17.
 */
public class Student {
    private int rollNo;
    private String name, address;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(int rollNo, String name, String address) {
        setRollNo(rollNo);
        setName(name);
        setAddress(address);
    }

    public String toString() {
        return getRollNo() + " " + getName() + " " + getAddress();
    }
}

class SortByRoll implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.getRollNo() - b.getRollNo();
    }
}

class SortByName implements Comparator<Student> {
    @Override
    public int compare(Student a, Student b) {
        return a.getName().compareTo(b.getName());
    }
}
