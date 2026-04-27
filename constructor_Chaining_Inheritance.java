class Vehicle{
    Vehicle(){
        System.out.println("This is the vehicle class constructor (Parent)");
    }
}

class Car extends Vehicle{
    Car(){
        // super() --> even though we didn't add here super method but by default every constructor first method is super()
        System.out.println("This is the car class constructor (Child)");
    }
}

public class constructor_Chaining_Inheritance {
    public static void main(String[] args) {
        Car c = new Car();
    }
}

//Hence answer is :
//This is the vehicle class constructor (Parent)
// This is the car class constructor (Child)