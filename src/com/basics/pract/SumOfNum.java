package com.basics.pract;

public class SumOfNum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

        // without using any loops
        System.out.println(10 * (10 + 1) / 2);

        System.out.println("Sum is " + sum(10));
    }

    public static int sum(int num){
        if(num==0){
            return 0;
        }else {
            return num+sum(num-1);
        }
    }
}
