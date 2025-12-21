package Polymorphisms;

// method overloading
class Calculator{
    int add (int num1, int num2){
        return num1 + num2;
    }
    double add (double num1, double num2){
        return num1 + num2;
    }
    int add(int num1 , int num2 , int num3){
        return num1 + num2 + num3;
    }
}

// method overriding
class Parents {
    static void StaticMethod(){
        System.out.println("static method");
    }
    void dispalyInfo(){
        System.out.println("displaying parents info");
    }
}

class Children extends Parents{
    // Q. Can we overrid static method => no we can't override static metohd given below error shows error while overriding static method
    // void StaticMethod(){
    //     System.out.println("static method");
    // }

    @Override
    void dispalyInfo(){
        // Q. how to trigger static method from child class
        Parents.StaticMethod();
        System.out.println("dispalying child info");
    }
}

public class polymorphismExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        // process of selecting which add form will be executed called polymorphism
        // given below is compile time polymorphism because code binding (static binding) is happend at compiled time
        System.out.println(calculator.add(4, 3));

        Children children = new Children();
        // give below is runtime polymorphism because inheritance code binding (dynamic binding) is happend at compiled time
        children.dispalyInfo();

    }
}
