package in.nexogen.in.basics;

public class Main {

    public static void main(String[] args) {

        //Sum.java
        Sum sum = new Sum();
        sum.setA(12);
        sum.setB(12);
        System.out.println(sum.getSum());

        //Student.java
        Student st2 = new Student();
        st2.setId(20);
        st2.setName("Vijay");
        System.out.println(st2.getId() + " " + st2.getName());

        //Employee.java
        Employee e1 = new Employee(),e2 = new Employee(),e3 = new Employee();

        e1.setId(1);
        e1.setName("Digvijay");
        e1.setSalary(5000);
        System.out.println(e1.getId() + " "+ e1.getName() + " " + e1.getSalary());

        e2.setId(2);
        e2.setName("Vijay");
        e2.setSalary(6000);
        System.out.println(e2.getId() + " " + e2.getName() + " " + e2.getSalary());

        e3.setId(3);
        e3.setName("Jay");
        e3.setSalary(7000);
        System.out.println(e3.getId() + " " + e3.getName() + " " + e3.getSalary());

        //AccountDetails.java
        System.out.println();
        AccountDetails a1 = new AccountDetails();
        a1.insert(832345,"Ankit",1000);
        a1.display();
        a1.checkBalance();
        a1.depositAmount(40000);
        a1.checkBalance();
        a1.withdraw(15000);
        a1.checkBalance();


        //Object Class examples
        System.out.println();
        System.out.println(st2.toString());
        System.out.println(Integer.toHexString(st2.hashCode()));

        System.out.println(st2);
        System.out.println(st2.toString());

        //StaticDemo.java
        System.out.println();
        StaticDemo.setCllg("XYZ");
        StaticDemo s1 = new StaticDemo("Alice");
        StaticDemo s2 = new StaticDemo("Bob");
        s1.getStudentInfo();
        s2.getStudentInfo();

        //OuterClass.java
        System.out.println();
        OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass();
        printer.printMessage();

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.display();

        OuterClass.InnerClass innerClass1 = new OuterClass().new InnerClass();
        innerClass1.display();
        
    }
}
