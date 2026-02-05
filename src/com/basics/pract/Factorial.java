package com.basics.pract;

public class Factorial {

    public static void fact(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
            System.out.println(fact);
    }

    // using recursion
    public static int factRe(int num1){

        if(num1==1){
            return 1;
        }else {
            return num1*factRe(num1-1);
        }
    }
    public static void main(String[] args) {
            fact(5);
        System.out.println(factRe(5));
    }
}
