abstract class Car{
    abstract void start();
    abstract void drive();
    void applyBreak(){
        System.out.println("The break is applied");
    }
}

class Driver extends Car{
    void start(){
        System.out.println("Car is started");
    }

    void drive(){
        System.out.println("Drive the car properly");
    }

}


public class abstraction {
    public static void main(String[] args) {
        Driver d = new Driver();

        d.start();
        d.drive();
        d.applyBreak();
    }
}
