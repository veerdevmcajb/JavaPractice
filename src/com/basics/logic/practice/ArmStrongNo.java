package com.basics.logic.practice;

import java.util.Scanner;

public class ArmStrongNo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a num");
        int num=sc.nextInt();

        int temp=num;
        int rev=0,rem=0;

        while(num>0){
            rem=num%10;
            rev=rev+(rem*rem*rem);
            num=num/10;
        }

        if(temp==rev){
            System.out.println(temp +" is ArmStrong");
        }else{
            System.out.println(temp +" is not Armstrong");
        }

    }
}
