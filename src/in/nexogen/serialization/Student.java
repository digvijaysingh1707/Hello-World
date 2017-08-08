package in.nexogen.serialization;

import java.io.Serializable;

/**
 * Created by dv on 1/8/17.
 */
public class Student implements Serializable {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }\
}