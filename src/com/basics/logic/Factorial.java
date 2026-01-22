package com.basics.logic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a num");
        int num=scan.nextInt();
        int fact=1;

        for(int i=1;i<=num;i++){
            fact=fact*i;
        }

        System.out.println("factorial is "+fact);

    }
}

/*
* fact=1, num=3
* 1*1=1
* 1*2=2
* 2*3=6
*
* */
