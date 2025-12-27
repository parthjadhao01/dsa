package Abstraction;

abstract class Car {
    // Q. can we create constructor in abstract class => yes
    Car(){
        System.out.println("Car constructor is getting called");
    }
    abstract public void start();
    public void Noise(){
        System.out.println("making noise.....");
    }
}

// Q. can abstract class extend or more abstract class => yes
abstract class deler extends Car{
    deler(){
        System.out.println("Deler constructor is getting called");
    }
    abstract public void delerMethod();
}

// abstraction using interface
interface CarInterface {
    public void start();
    
    // introducted after java 8 for supporting backward compatibility
    // default and static
    default void noise(){
        System.out.println("Noise...");
    }
    static void numberOfWheels(){
        System.out.println("Wheels of 4");
    }
}

class AutomaticCar implements CarInterface{
    public void start(){
        CarInterface.numberOfWheels();
        System.out.println("automatic car is starting");
    }
}

class ManualCar extends deler{
    ManualCar(){
        
    }
    public void delerMethod(){
        System.out.println("deler method");
    }
    public void start(){
        System.out.println("manual car starting");
    }
    public void manualCarFunction(){
        System.out.println("manual car function");
    }
}

public class abstractionExample {
    public static void main(String[] args) {
        // Car car = new Car() //Q. can we create instance of abstract class => no its throw error
        Car manualCar = new ManualCar(); //can store object of the child class in parent class
        manualCar.start();
        manualCar.Noise();
        // manualCar.notify(); //can't access this if the manual car object is stored in parent class because it don't know the maual class function
    }
}
