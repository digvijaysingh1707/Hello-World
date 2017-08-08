package in.nexogen.in.basics;

/**
 * Created by dv on 1/8/17.
 */
public class Student {
    static int lastRoll = 100;
    int rollNo;
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    Student() {
        rollNo = lastRoll;
        lastRoll++;

    }

    @Override
    public int hashCode() {
        return rollNo;
    }
}
