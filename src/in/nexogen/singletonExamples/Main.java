package in.nexogen.singletonExamples;

/**
 * Created by dv on 4/8/17.
 */
public class Main {
    public static void main(String[] args) {
        TestSingleton single1 = TestSingleton.getSingleInstance();
        TestSingleton single2 = TestSingleton.getSingleInstance();
        TestSingleton single3 = TestSingleton.getSingleInstance();

        single1.s = (single1.s).toUpperCase();

        System.out.println("String from single1 is " + single1.s);
        System.out.println("String from single2 is " + single2.s);
        System.out.println("String from single3 is " + single3.s);
        System.out.println("\n");

        single3.s = (single3.s).toLowerCase();

        System.out.println("String from single1 is " + single1.s);
        System.out.println("String from single2 is " + single2.s);
        System.out.println("String from single3 is " + single3.s);

    }
}
