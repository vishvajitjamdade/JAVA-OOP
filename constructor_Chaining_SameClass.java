class student{
    String name;
    int age;
    String course;

    student(){
        this("Unknown");
        System.out.println("This is the Constructor_1");
    }

    student(String name){
        this(name,18);
        System.out.println("This is the Constructor_2");
    }

    student(String name, int age){
        this.name = name;
        this.age = age;
        this.course = "Unknown";
        System.out.println("This is the Constructor_3");
    }
}


public class constructor_Chaining_SameClass {
    public static void main(String[] args) {
        new student();
    }
}