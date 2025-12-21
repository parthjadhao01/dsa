package Inheritance;

class School{
    private String name;
    School(String name){
        this.name=name;
    }
    void printSchoolName(){
        System.out.println("School name "+name);
    }
}

class Student extends School{
    private String name;
    Student(String schoolName,String studentName){
        super(schoolName);
        this.name = studentName;
    }
    void printStudentName(){
        System.out.println("Student name "+name);
    }
    
}

class Teacher extends School{
    private String name;
    Teacher(String schoolName,String teacherName){
        super(schoolName);
        this.name = teacherName;

    }
    void printTeacherDetail(){
        System.out.println("Teacher name " + name);
    }
}


// class Parents extends Student{
//     private String name;
//     Parents(String name,String studentName){
//         super(studentName);
//         this.name = name;
//     }
//     void printParentAndStudent(){
//         System.out.println("Parent name "+name);
//     }
    
// }

public class inheritanceExample {
    public static void main(String[] args) {
        // Student student1 = new Student("Parth");
        // School school = new School();
        // student1.printStudentName();
        // school.printStudentName();
        // student1.printSchoolName();;
        
        // multilevel inheritance
        // Parents parents = new Parents("dad","son");
        // parents.printParentAndStudent();
        // parents.printStudentName();
        // parents.printSchoolName();

        // hirarchical inheritance
        System.out.println("Student detail");
        Student student = new Student("SOS", "Parth");
        student.printStudentName();
        student.printSchoolName();

        System.out.println("Teacher detail");
        Teacher teacher = new Teacher("SOS","Bagu");
        teacher.printSchoolName();
        teacher.printTeacherDetail();
        
    }
}
