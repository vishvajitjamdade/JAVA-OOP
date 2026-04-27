
class A{
    A(){
        System.out.println("Super class constructor");
    }

    A(int a){
        System.out.println("Super class contstructor with value: " + a);
    }
}

class B extends A{
    B(){
        this(10);
        System.out.println("Child class constructor");
    }

    B(int a){
        System.out.println("Child class contstructor with value: " + a);
    }
}

public class UseOfSuper {
    public static void main(String[] args) {
        B b = new B();
    }
}
