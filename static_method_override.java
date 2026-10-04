class parent{
    static void show(){
        System.out.println("This is Parent class");
    }
}

class child extends parent{
    static void show(){
        System.out.println("This is Child class");
    }
}

public class static_method_override {

    public static void main(String[] args) {
        parent p = new child();
        p.show();
    }
}