package com.basics.logic.practice;

import java.util.Scanner;

public class CheckPrimeNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int num=sc.nextInt();

        int count=0;

        for(int i=2;i<num;i++){
            if(num % i == 0){
                count ++;
                break;
            }
        }
        if(count ==0){
            System.out.println("Num is Prime");
        }else{
            System.out.println("Num is Not prime");
        }
    }
}
