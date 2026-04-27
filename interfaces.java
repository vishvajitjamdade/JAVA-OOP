interface A{
    abstract public void a();
    default void display(){
        System.out.println("This is the default method");
    }
}

class B implements A{
    public void a(){
        System.out.println("Method of interface A");
    }
}


public class interfaces {
    public static void main(String[] args) {
        B b = new B();
        b.display();
        b.a();
    }
}
