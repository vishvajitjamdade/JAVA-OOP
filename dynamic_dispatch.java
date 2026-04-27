//those methods are present in parent class or overidden methods 
//only those methods we can call in dynamic dispatch method


class parent{
    void method1(){
        System.out.println("Parent : Method1");
    }

    void method2(){
        System.out.println("Parent : Method2");
    }
}

class child extends parent{
    void method2(){
        System.out.println("Child : Method2");
    }

    void method3(){
        System.out.println("Child : Method3");
    }
}


public class dynamic_dispatch {
    public static void main(String[] args) {
        parent p = new child();
        p.method1();
        p.method2();
    }
}
