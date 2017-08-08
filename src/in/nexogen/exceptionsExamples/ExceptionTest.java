package in.nexogen.exceptionsExamples;

/**
 * Created by dv on 2/8/17.
 */

// all exceptions and error are subclass of Throwable class
// exceptions are condition that a program should catch
// Errors cannot be handled in a program rather JVM indicates errors to JRE
// Exception and Error class are subclass of Throwable class
// Exceptions are of 2 Types -->
// 1. Checked --> Checked at Compile Time i.e. --> should be handled or thrown using throws
// 2. Unchecked --> Not Checked at Compile Time i.e. --> should be handled in any way
// Errors are VirtualMachineErrors or AssertionError or StackOverFlowError or OutOfMemoryError
// Examples -->
// 1. Checked -->
// --> SQLException extends Exception extends Throwable extends Object --> Provides information on database access error
// --> IOException extends Exception extends Throwable extends Object --> Signals that any I/O exception have occurred
// --> DataAccessException extends Exception extends Throwable extends Object --> Handled by data access modules
// --> ClassNotFoundException extends ReflectiveOperationException extends Exception extends Throwable extends Object --> Signals class with the specified name could be found
// --> InvocationTargetException extends ReflectiveOperationException extends Exception extends Throwable extends Object --> It wraps an exception thrown by invoked method or constructor
//
// 2. Unchecked -->
// --> NullPointerException extends RuntimeException extends Exception extends Throwable extends Object --> Signals when calling method of a null object
// --> ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException extends RuntimeException extends Exception extends Throwable extends Object --> signals array have been accessed with wrong index i.e. negative or greater than size of the array
// --> ArithmeticException extends RuntimeException extends Exception extends Throwable extends Object --> Thrown when exceptional arithmetic condotion has occurred e.g. Divide by zero(0)
// --> IllegalArgumentException extends RuntimeException extends Exception extends Throwable extends Object --> Thrown to indicate that a method has been passed an illegal or inappropriate argument
public class ExceptionTest {

    static int divideByZero (int a, int b) {
        int result = a / b;
        return result;
    }

    static int computeDivision (int a, int b) {
        int result = 0;
        try {
            result = divideByZero(a, b);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException have occurred");
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            int result = computeDivision(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
