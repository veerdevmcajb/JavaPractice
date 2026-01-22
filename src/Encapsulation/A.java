package Encapsulation;

import java.util.Scanner;

public class A {
    private int rollNo;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
}

class B{
    void display(){
        Scanner sc=new Scanner(System.in);
        A obj=new A();
        System.out.println("Enter yor rollNo ");
        obj.setRollNo(sc.nextInt());

        System.out.println("Enter Your Name ");
        obj.setName(sc.next());

        System.out.println("Roll no is : " + obj.getRollNo());
        System.out.println("Name is : "+ obj.getName());
    }

    public static void main(String[] args) {
        new B().display();
    }
}
