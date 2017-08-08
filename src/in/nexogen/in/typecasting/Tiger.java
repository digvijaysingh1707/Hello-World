package in.nexogen.in.typecasting;

/**
 * Created by dv on 1/8/17.
 */
public class Tiger implements Animal{


    public void tigerFunc(){
        System.out.println("tiger func");
    }

    @Override
    public void verte() {
        System.out.println(getClass().getSimpleName() + "--> verte function");
    }

    @Override
    public void abc() {
        System.out.println(getClass().getSimpleName() + "--> abc function");
    }
}
