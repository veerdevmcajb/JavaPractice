package com.basics.logic;

import java.util.Scanner;

//Reverse number
public class Reverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter num");
        int num=scan.nextInt();
        int rev=0,rem;

//        while(num !=0){
//            rev=rev*10;         // 0        --
//            rev=rev+num%10;     // 0+3=3
//            num=num/10;         // 12
//        }

        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }

//        while(num!=0){
//            rem=num%10;
//            System.out.print(rem);
//            num=num/10;
//        }

        System.out.println(rev);
    }
}
