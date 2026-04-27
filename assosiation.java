class Driver{
    void drive(Car car){
        System.out.println("This is the driver method");
    }
}

class Car{
    void start(){
        System.out.println("This is the start method");
    }
}


public class assosiation {
    public static void main(String[] args) {
        Driver d = new Driver();
        Car c = new Car();

        d.drive(c);
    }
}
