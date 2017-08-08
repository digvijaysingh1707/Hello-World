package in.nexogen.enumExamples;

/**
 * Created by dv on 4/8/17.
 */
public abstract class Mobile {
    public abstract void setMobile(String name);
    public abstract void awesomeFunc(String name);

    public int getA() {
        return a;
    }

    int a;
    public Mobile(String name){
        setMobile(name + " HELLO WORLD");
        myFunction();
    }

    private float myFunction() {
        return 0;
    }


}
