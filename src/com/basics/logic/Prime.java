package com.basics.logic;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter num");
        int num=scan.nextInt();
        int count=0;

        for(int i=2;i<num;i++){
            if (num % i==0){
                count ++;
                break;
            }
        }
        if (count==0){
            System.out.println("NUm is prime");
        }
        else {
            System.out.println("Num is not a prime");
        }
    }
}
