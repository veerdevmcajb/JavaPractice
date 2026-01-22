package com.basics.pract;

import java.util.Scanner;

// Even or Odd
public class Prog2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Num");
        int num=scan.nextInt();
        if(num%2==0){
            System.out.println(num +" is Even");
        }
        else {
            System.out.println(num+ " is Odd");
        }
    }
}
