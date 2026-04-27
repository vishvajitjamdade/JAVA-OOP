class student1 {
    void details(String name, int age) {
        System.out.println("This is parent class method");
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
    }

    void details(String name, int age, String DOB) {
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
        System.out.println("DOB is : " + DOB);
    }
}

class student2 extends student1 {
    @Override
    void details(String name, int age) {
        System.out.println("This is child class method");
        System.out.println("Name is : " + name);
        System.out.println("Age is : " + age);
    }
}

public class polymorphism {
    public static void main(String[] args) {
        student2 s = new student2();
        s.details("Vishvajit", 21);
        // s.details("Anmol", 22, "04-01-2004");
    }
}
