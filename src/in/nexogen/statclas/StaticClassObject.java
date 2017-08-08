package in.nexogen.statclas;

/**
 * Created by dv on 2/8/17.
 */
public class StaticClassObject {
    public static void main(String args[]){
        SomeClass some = SomeClass.getSomeClassObject();
        some.setA(12);
        some.printA();


        SomeClass abc = SomeClass.getSomeClassObject();
        some.printA();

        boolean flag = true;

        int a = (flag) ? 1 : 2;
        System.out.println(a);

    }
}
