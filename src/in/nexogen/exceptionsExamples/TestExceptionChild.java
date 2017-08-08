package in.nexogen.exceptionsExamples;

import java.io.IOException;

/**
 * Created by dv on 3/8/17.
 */

class Parent {
    void msg() throws ArithmeticException {
        System.out.println("Parent");
    }
}
public class TestExceptionChild extends Parent {
    void msg() throws ArithmeticException {
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Parent parent = new TestExceptionChild();
        parent.msg();
    }
}
