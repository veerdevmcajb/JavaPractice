package Constructor;

/**
 * Create a class Student with:
 * variables: name, age
 * a constructor that initializes both
 * print details using a method
 */

public class Student {
    String name;
    int age;

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    void details(){
        System.out.println("Student name is :"+name);
        System.out.println("Student age is :"+age);
    }

    public static void main(String[] args) {
        Student s=new Student("Akshay",30);
        s.details();
    }
}
