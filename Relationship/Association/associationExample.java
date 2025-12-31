// given below is one to one Association

package Relationship.Association;

class Passport{
    private String PassportNumber;
    Passport(String PassportNumber){
        this.PassportNumber = PassportNumber;
    }
    public String getPassportNumber(){
        return PassportNumber;
    }
}

class Student{
    private String student;
    private Passport passport;
    Student(String student, Passport passport){
        this.student = student;
        this.passport = passport;
    }
    public void printStudentDetail(){
        System.out.println("Student name : "+student);
        System.out.println("Student Passport number : "+passport.getPassportNumber());
    }
}

public class associationExample {
    public static void main(String[] args) {
        String studentName = "parth";
        Passport passport = new Passport("343423432");
        Student student = new Student(studentName, passport);
        student.printStudentDetail();
    }   
}
