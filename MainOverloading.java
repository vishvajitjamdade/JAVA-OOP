public class MainOverloading {
    public static void main(String[] args) {
        //JVM always executes first main(String[] args) method
        System.out.println("This is the standard main method main(String[] args)");
        main(10);
        main("vishvajit");
    }


    public static void main(int x) {
        System.out.println("Main method with (int x) variable : " + x);
    }

    public static void main(String msg) {
        System.out.println("Main method with (String msg :) : " + msg);
    }
}
