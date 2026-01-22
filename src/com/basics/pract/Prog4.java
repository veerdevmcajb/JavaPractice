package com.basics.pract;

import java.util.Scanner;

//Swap using third variable
public class Prog4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two num");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c;
         c=a;
         a=b;
         b=c;

         System.out.println("After Swaping " + a+" "+ b);



    }
}
