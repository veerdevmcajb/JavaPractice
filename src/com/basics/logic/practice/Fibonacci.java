package com.basics.logic.practice;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Num");
        int num=sc.nextInt();

        int a=0,b=1,c=0;

        while(c<num){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }

    }
}
