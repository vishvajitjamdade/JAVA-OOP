class A{
    A(){
        this(0);
        System.out.println("This is the parent class");
    }

    A(int a){
        System.out.println("Parent class with value : " + a);
    }
}

class B extends A{
    B(){
        this(5);
        System.out.println("This is child class");
    }

    B(int a){
        System.out.println("Child class with value : " + a);
    }
}


public class constructor_practice {
    public static void main(String[] args) {
        new B();
    }
}
