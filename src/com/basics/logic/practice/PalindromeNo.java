package com.basics.logic.practice;

import java.util.Scanner;

public class PalindromeNo {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num= sc.nextInt();

        int rev=0,rem ;
        int temp=num;

        while(num>0){
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }

        if(temp==rev){
            System.out.println(temp + " Num is Palindrome");
        }else {
            System.out.println(temp +" Num is not Palindrome");
        }
    }
}
