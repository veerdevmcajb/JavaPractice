package com.basics.logic;

import java.util.Scanner;

public class ArmstrongNum {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a NUm");
        int num=scan.nextInt();
        int rem,rev=0,temp=num;

//        while (num>0){
//            rem=num%10;
//            rev=rev+(rem*rem*rem);
//            num=num/10;
//        }

        int digits=String.valueOf(temp).length();
        while (num>0){
            rem=num%10;
            rev=rev+(int)Math.pow(rem,digits);
            num=num/10;
        }

        if(temp==rev){
            System.out.println(temp+" is Armstrong");
        }
        else {
            System.out.println(temp+" is not a Armstrong");
        }
    }
}


//153, 370, 371,407,1634

//a num that is equal to the sum of its own power  digits