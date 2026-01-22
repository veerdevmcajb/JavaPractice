package com.basics.pract;

import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two num");
        int a=scan.nextInt();
        int b=scan.nextInt();

        a=a+b; //  10+5=15
        b=a-b;  // 15-5=10
        a=a-b;  // 15-10=5

        System.out.println("After Swaping " + a +" "+b);
    }
}
