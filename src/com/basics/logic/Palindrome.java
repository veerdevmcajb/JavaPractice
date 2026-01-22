package com.basics.logic;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a num");
        int num=scan.nextInt();
        int rev=0,temp=num;
        int rem;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;

        }

        if(rev==temp){
            System.out.println(temp + " is palindrome");
        }
        else {
            System.out.println(temp +" is not a palindrome");
        }
    }
}
