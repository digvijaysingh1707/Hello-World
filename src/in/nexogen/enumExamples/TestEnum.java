package in.nexogen.enumExamples;

/**
 * Created by dv on 4/8/17.
 */

// First line inside enum should be list of constants and then other things like methods, variables and constructor.
// Every enum internally implemented by using class
// Every enum constant represent an object of type enum
// Every enum constant is always implicitly public static final
// Since it is static, we cannot access it by using enum Day(Name)
// Since it is final, we can't create child enum
// We can declare main method inside enum. Hence enum can be directly invoked from command prompt
// Can implement many interface
enum Color {
    RED, GREEN, BLUE;

    private Color() {
        System.out.println("Constructor called for : " + this.toString());
    }
    public void colorInfo() {
        System.out.println("Universal Color");
    }
}

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}
public class TestEnum {
    Day day;

    public TestEnum(Day day) {
        this.day = day;
    }

    public void dayIsLike() {


        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekends are best");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
        c1.colorInfo();
        Color[] colors = Color.values();
        for (Color color : colors) {
            System.out.println(color + " at index " + color.ordinal());
        }
        System.out.println(Color.valueOf("RED"));

        String string = "MONDAY";
        TestEnum testEnum = new TestEnum(Day.valueOf(string));
        testEnum.dayIsLike();
    }
}
