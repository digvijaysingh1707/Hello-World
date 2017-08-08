package in.nexogen.exceptionsExamples;

/**
 * Created by dv on 2/8/17.
 */
public class Test {
    public static void main(String[] args) {
        int [] arr = new int[4];
        try {
            int i = arr[4];
            System.out.println("Inside try block");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("finally block executed");
        }
        System.out.println("Outside try-finally clause");
    }
}
