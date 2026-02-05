package com.basics.pract;

public class Fibonacci {
    public static void fibo(int num){
        int firstNum=0;
        int secondNum=1;
        int res=0;
        for(int i=1;i<=5;i++){
            System.out.println(firstNum);
            res=firstNum+secondNum;
            firstNum=secondNum;
            secondNum=res;
        }
    }

    public static void main(String[] args) {
       fibo(5);
    }
}
