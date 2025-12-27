// Q. what are inner class => any java classes that are defined inside another class
// Q. Types of inner class => static nested class ,non static inner class , local inner class, anonymus inner class
// Q. static nested class => static , access only static memeber , no instance of outer class required
// Q. non-static inner class => tied to instance of the outer class , can access all attribute and metho of outer class
// Q. local inner class => class defined under method or block ,can access final or effiectevly final local variables of method
// Q. anonymous inner class => class without the name , one time use , implement for contracts

package InnerClass;

import java.util.ArrayList;

// ---------------------Static nested class Example code -----------------------
// class OuterClass{
//     static int val = 10;
//     String name = "parth";

//     static class InnerClass{
//         public void execute(){
//             System.out.println("Inner class executed" + val); //val can be printed because it static memeber
//             // System.out.println("trying to print name" + name); //name can't be preinted because it non-statics memeber
//         }
//     }

//     public void execute(){
//         InnerClass innerClass = new InnerClass();
//         innerClass.execute();
//     }
// }

// ---------------------Non Static nested class Example code -----------------------
// class OuterClass{
//     static int val = 10;
//     String name = "Outer class";

//     class InnerClass{
//         public void execute(){
//             System.out.println("Inner class execute"+val);//can access val static variable
//             System.out.println("Inner class execute name "+name);//can access name non static variable also
//         }
//     }
// }

// ---------------------local inner class Example code-----------------------
// class OuterClass {
//     public void execute() {
//         final int val = 0;
//         class InnerClass {
//             public void execute() {
//                 System.out.println("Inner class executed" + val);// can access effectively final or final variables or method
//             }
//         }
//         InnerClass innerClass = new InnerClass();
//         innerClass.execute();
//     }

// }

// ---------------------anonymous inner class Example code-----------------------
interface Sample{
    public void execute();
}

interface Task{
  public void execute();
}
class Robot{
  String name;
  Robot(String name){
    this.name = name;
  }
  public void performAction(){
    System.out.println(name + " is performing an action.");
  }
  class Arm{
    public void pickItem(){
      System.out.println(name + " arm picking an item.");
    }
  }
  static class Processor{
    public void process(){
      System.out.println("Processor analyzing the data.");
    }
  }
  public void manageSensors(){
    class LocalInnerClass{
      public void sense(){
        System.out.println(name + " sensor detecting obstacles.");
      }
    }
    LocalInnerClass localInnerClass = new LocalInnerClass();
    localInnerClass.sense();
  }
  Task executeTask = new Task(){
    public void execute(){
        System.out.println(name);
    }
  };
}

public class innerClassExaple {
    public static void main(String[] args) {

        // ---------------------Static nested class Example code-----------------------
        // OuterClass.InnerClass innerClass = new OuterClass.InnerClass();
        // innerClass.execute();
        // Accessing Inner class through outer class
        // OuterClass outerClass = new OuterClass();
        // outerClass.execute();

        // ---------------------non Static nested class Example code-----------------------
        // OuterClass outerClass = new OuterClass();
        // OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        // innerClass.execute();

        // ---------------------local inner class Example code-----------------------
        // OuterClass outerClass = new OuterClass();
        // outerClass.execute();

        // ---------------------Anonymous inner class Example code-----------------------
        Sample sample = new Sample(){
            public void execute(){
                System.out.println("executed");
            }
        };
        sample.execute();

        ArrayList<Integer> list = new ArrayList<>(){
            @Override
            public boolean add(Integer val){
                System.out.println("val : "+val);
                return super.add(val);
            }
        };
        list.add(23);
        list.add(31);

        System.out.println(list);
    }
}