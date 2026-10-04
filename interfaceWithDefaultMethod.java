interface A{
    default void meth(){
        System.out.println("This is default method in interface : A");
    }
    abstract void show();
}

interface B{
    abstract void display();
}

class C implements A,B{
    public void show(){
        System.out.println("This is show method of interface : A");
    }

    public void display(){
        System.out.println("This is display method of interface : B");
    }
}

public class interfaceWithDefaultMethod {
    public static void main(String[] args) {
        C c = new C();
        c.show();
        c.display();
        c.meth();       //calling to default method
    }
}
