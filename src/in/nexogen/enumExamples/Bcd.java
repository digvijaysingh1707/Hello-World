package in.nexogen.enumExamples;

/**
 * Created by dv on 4/8/17.
 */
public class Bcd {
    public Bcd(){
        Mobile m = new Mobile("LG") {
            @Override
            public void setMobile(String name) {
                System.out.println(name);
            }

            @Override
            public void awesomeFunc(String name) {
                System.out.println(name);
            }
        };
    }
}
