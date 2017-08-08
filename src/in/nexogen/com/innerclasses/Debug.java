package in.nexogen.com.innerclasses;

/**
 * Created by dv on 3/8/17.
 */
public class Debug {
    private static boolean DEBUG = true;

    public static void log(Object obj){
        if (DEBUG) System.out.println(obj.toString());
    }
}
