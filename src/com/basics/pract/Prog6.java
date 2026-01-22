package com.basics.pract;

import java.util.Scanner;

//Largest of two
public class Prog6 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Two nums");
        int a=scan.nextInt();
        int b=scan.nextInt();

        System.out.println(a>b ? a + " A is greater " :b+" B is greater");

    }
}
