package in.nexogen.in.basics;

import java.io.*;
import java.util.Date;

/**
 * Created by dv on 2/8/17.
 */

    //transient is used in serialization
    //used when we not want to save value of a particular variable in file
    //when come across transient keyword --> ignores original value of the variable and stores the default value
    //plays important role to meet security constraints

public class TransientDemo implements Serializable {

    //normal variables
    int i = 10, j = 20;

    //transient variable
    transient int k = 30;

    //transient have no effect here
    transient static int l = 40;
    transient final int m = 50;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        TransientDemo input = new TransientDemo();

        //serialization
        FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(input);

        //de-serialisation
        FileInputStream fileInputStream = new FileInputStream("abc.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        TransientDemo output = (TransientDemo) objectInputStream.readObject();
        System.out.println("i = " + output.i);
        System.out.println("j = " + output.j);
        System.out.println("k = " + output.k);
        System.out.println("l = " + output.l);
        System.out.println("m = " + output.m);

    }
}
