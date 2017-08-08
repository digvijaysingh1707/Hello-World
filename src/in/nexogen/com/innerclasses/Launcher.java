package in.nexogen.com.innerclasses;

/**
 * Created by dv on 3/8/17.
 */
public class Launcher {
    public static void main(String args[]){
       int [] a = new int[10];
        int res = 0;
        for (int i = 1; i <= 10000; i++) {
            res += i;
        }
        Debug.log(res);
    }
}
