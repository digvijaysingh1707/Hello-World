package in.nexogen.arrays;

import in.nexogen.arrays.Constants.Gender;

/**
 * Created by dv on 1/8/17.
 */
public class Student {
    private String name;
    private int age;
    private Gender gender;

    public Student(String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    @Override
    public String toString() {
        String output = name + " age is ->" + age + " gender->" + gender;
        return output;
    }
}
