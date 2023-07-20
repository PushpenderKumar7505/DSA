package oobs;

public class constructor {
    public static void main(String[] args) {
Student s1=new Student();
Student s2=new Student("panakaj");
Student s3=new Student(123);
    }
}
class Student{
    String name;
    int rollno;

Student(){
    System.out.println("well done");
}
   Student(String name){
    this.name = name;
   }

   Student(int roll){
    this.rollno = roll;
   }
    }