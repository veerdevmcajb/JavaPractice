package com.basics.logic;
import java.util.Scanner;

//Largest of three
public class Prog1 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Three Nums");
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();

        if(a>b && a>c){
            System.out.println(a+" is largest");
        } else if (b>a && b>c) {
            System.out.println(b+ " is Largest");
        }
        else {
            System.out.println( c+ " is Largest");
        }
    }
}
