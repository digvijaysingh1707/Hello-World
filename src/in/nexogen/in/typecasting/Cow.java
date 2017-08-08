package in.nexogen.in.typecasting;

/**
 * Created by dv on 1/8/17.
 */
public class Cow implements Animal{
    @Override
    public void verte() {
        System.out.println(getClass().getSimpleName() + "--> verte function");
    }

    @Override
    public void abc() {
        System.out.println(getClass().getSimpleName() + "--> abc function");
    }

    public void cowFunc(){
        System.out.println(getClass().getSimpleName() + "--> cow function");
    }
}
