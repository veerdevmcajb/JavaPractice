package com.basics.pract;

import java.util.Scanner;

//Sum of two numbers
public class Prog1 {
    public static void main(String[] args) {
        Prog1 obj=new Prog1();
        obj.natha();

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two no");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c= a+b;
        System.out.println("Sum of two nums is "+ c);

    }

    void natha(){
        System.out.println("I am Natha Bhau");
    }
}
