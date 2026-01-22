package com.basics.pract;

import java.util.Scanner;

public class Prog10 {
    String name;
    int age;
    long contact;


    public void user(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Name");
        this.name=scan.next();
        System.out.println("Enter Age");
        this.age=scan.nextInt();
        System.out.println("Enter Contact");
        this.contact=scan.nextLong();
        System.out.println("userName is : "+ this.name);
        System.out.println("userAge is : "+ this.age);
        System.out.println("userContaact is : "+ this.contact);

    }

    public static void main(String[] args) {
        Prog10 p=new Prog10();
        p.user();
    }


}
