package in.nexogen.in.basics;

/**
 * Created by dv on 1/8/17.
 */
public class OuterClass {
    private static String msg = "Hello";

    public static class NestedStaticClass {
        public void printMessage() {
            System.out.println("Message from nested static class: " + msg);
        }
    }

    public class InnerClass {
        public void display() {
            System.out.println("Message from non-static nested class: "+ msg);
        }
    }
}
