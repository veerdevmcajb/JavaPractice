package com.basics.pract;

import java.util.Scanner;

//Positive or Negative
public class Prog7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Num");
        int num=scan.nextInt();

        if(num>0){
            System.out.println(num+" is Positive");
        } else if (num<0) {
            System.out.println(num+" is Negative");
        }
        else {
            System.out.println(num+" is Zero");
        }

    }
}
