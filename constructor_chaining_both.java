class Vehicle{
    int speed;

    Vehicle(){
        this(40);
        System.out.println("This is the default constructor vehicle");
    }

    Vehicle(int speed){
        this.speed = speed;
        System.out.println("This is the parameterized constructor vehicle");
    }
}

class Car extends Vehicle{
    String model;

    Car(){
        this("Unknown");
        System.out.println("This is the default constructor car");
    }

    Car(String model){
        super();
        this.model = model;
        System.out.println("This is the parameterized constructor vehicle");
    }
}

public class constructor_chaining_both {
    public static void main(String[] args) {
        // Car c = new Car();
        new Car();
    }
}
