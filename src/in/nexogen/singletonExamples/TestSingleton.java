package in.nexogen.singletonExamples;

/**
 * Created by dv on 4/8/17.
 */

// It is a class that can have only one object at a time
// After first time if we try to again instantiate the Singleton class, the new variable also points to the first instance created
// So whatever modification we do in any instance , a single instance is only affected and the changes is visible through any instance
// Making the constructor private and write a static class that has return type object of this singleton class
public class TestSingleton {
    private static TestSingleton singleInstance = null;

    public String s;

    private TestSingleton() {
        s = "Hello I am a string part of Singleton class";
    }

    public static TestSingleton getSingleInstance() {
        if (singleInstance == null)
            singleInstance = new TestSingleton();
        return singleInstance;
    }
}
