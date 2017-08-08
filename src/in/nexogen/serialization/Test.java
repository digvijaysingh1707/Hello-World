package in.nexogen.serialization;

import java.io.*;

/**
 * Created by dv on 1/8/17.
 */
public class Test {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Digvijay Singh");
        String fileName = "file.txt";

        //Serialization
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(student1);

            objectOutputStream.close();
            fileOutputStream.close();
        }
        catch (IOException e) {
            System.out.println("IOException is caught");
        }

        Student student2 = null;

        //Deserialization
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            student2 = (Student)objectInputStream.readObject();

            objectInputStream.close();
            fileInputStream.close();

            System.out.println("Object has been deserialized ");
            System.out.println("Student1 id= " + student1.getId());
            System.out.println("Student2 id= " + student2.getId());
        }
        catch (IOException e) {
            System.out.println("IOException is caught");
        }
        catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}
