package in.nexogen.in.typecasting;

/**
 * Created by dv on 1/8/17.
 */
public class Launcher {
    public static void main(String [] str){
        Tiger t = new Tiger();
        someFunc(t);

        Cow c = new Cow();
        someFunc(c);
    }


    public static void someFunc(Animal a){
        if (a instanceof Tiger){
            ((Tiger)a).tigerFunc();
        }else if (a instanceof Cow){
            ((Cow)a).cowFunc();
        }
    }
}
