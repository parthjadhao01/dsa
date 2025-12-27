// Interface is OOP concept it provides blue print of the class the method which should be present in the class as you can see below
// Q. why use interface => (multiple inheritance,contracts,loosely coupled)
package Interface;


interface CarInterface{
    // int door = 4; //final variable
    static final int door = 4 ; // we write it like this for better readability
    public void start();
    public void numberOfGears();

    // default and static -> this features came after Java8
    // default
    default void Airbags(){
        System.out.println("Car has 5 Airbags");
    }
    // static
    static void printVechicleType(){
        System.out.println("It is a car");
    }
}


// Q. can a blass can implement multiple interface => yes as you can see in given below code

interface SunRoof {
    public void sunRoofMethod();
}

class ManualCar implements CarInterface,SunRoof{
    public void start(){
        // door++ // can't to this because door is final variable not instance variable we can override it but can't change it value
        Airbags(); // can access this like this because we implmented the class
        System.out.println("Manual car is starting "+ door); //can access and implment the interface variable also
    }
    public void numberOfGears(){
        System.out.println("Manual car has 6 gears");
    }
    // overriding the default method is possible
    public void Airbags(){
        System.out.println("new airbags");
    }
    public void sunRoofMethod(){
        System.out.println("Sunroof....");
    }
    
}


public class interfaceExample {
    public static void main(String[] args) {
        CarInterface manualCar = new ManualCar();
        manualCar.start();
        manualCar.numberOfGears();
        manualCar.Airbags(); // -> this is default method it can be override also
        // manualCar.printVechicleType(); //-> can't do this
        CarInterface.printVechicleType();
    }
}
