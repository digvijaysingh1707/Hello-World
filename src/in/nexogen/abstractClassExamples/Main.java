package in.nexogen.abstractClassExamples;

/**
 * Created by dv on 4/8/17.
 */


abstract class Base {
    public Base() {
        System.out.println("Base Constructor Called");
    }
    abstract void fun();
}

class Derived extends Base {
    public Derived() {
        System.out.println("Derived Constructor Called");
    }

    @Override
    void fun() {
        System.out.println("Derived fun() Called");
    }
}
public class Main {
    public static void main(String[] args) {
        Derived derived = new Derived();
    }
}
