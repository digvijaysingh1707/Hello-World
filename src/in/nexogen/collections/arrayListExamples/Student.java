package in.nexogen.collections.arrayListExamples;

/**
 * Created by dv on 2/8/17.
 */
public class Student {
    private int rollNo;
    private String name;
    private int age;

    Student(int rollNo, String name, int age) {
        setRollNo(rollNo);
        setName(name);
        setAge(age);
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
