package in.nexogen.statclas;

/**
 * Created by dv on 2/8/17.
 */
public class SomeClass {
    private static SomeClass someClassObject;
    private int a = 2;
    public static SomeClass getSomeClassObject() {
        if (someClassObject == null) {
            System.out.println("creating new object");
            someClassObject =  new SomeClass();
        }
        System.out.println("returning object");
        return someClassObject;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void printA(){
        System.out.println("value of a is " + a);
    }
}
