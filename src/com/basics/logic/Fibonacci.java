package com.basics.logic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter num");
        int num=scan.nextInt();
        int a=0,b=1,c=0;
        System.out.println(a);
        System.out.println(b);

        while(c<num){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;

        }
    }
}








//        while(true){
//            c=a+b;
//            if(c<num){
//                System.out.println(c);
//            }else {
//                break;
//            }
//            a=b;
//            b=c;
//        }
