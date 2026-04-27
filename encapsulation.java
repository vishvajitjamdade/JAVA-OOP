class ATM{
    private int pin;
    private String email;

    public void setter(int pin, String email){
        this.pin = pin;
        this.email = email;
    }

    public void getter(){
        System.out.println("Your pin is here : " + pin);
        System.out.println("Your email is : " + email);
    }
}


public class encapsulation {
    public static void main(String[] args) {
        ATM atm = new ATM();
        atm.setter(123, "example@gmail.com");
        atm.getter();
    }
}
