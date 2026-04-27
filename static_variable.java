public class static_variable {
    static int a = 5;

    static_variable(){
        System.out.println(a++);
    }
    public static void main(String[] args) {
        new static_variable();
        new static_variable();
        new static_variable();
    }
}
