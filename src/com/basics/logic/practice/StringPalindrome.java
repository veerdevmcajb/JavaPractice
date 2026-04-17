package com.basics.logic.practice;

import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Name");
        String name = sc.next();

        String reverse = new StringBuilder(name).reverse().toString();

        if(name.equals(reverse)){
            System.out.println(name +" is Palindrome");
        }else{
            System.out.println(name +" is not palindrome");
        }

    }
}
