package exception_Handling;

import java.util.Scanner;

public class ClassA {

    void method1(){
        Scanner sc=new Scanner(System.in);
        System.out.println(10);
        try{
            System.out.println("try block executed");
            System.out.println("Enter a num");
            System.out.println(20/sc.nextInt());
        }catch (ArithmeticException e){
            System.out.println("Catch block executed..");
        }
        finally {
            System.out.println("Finally block executed");
        }
        System.out.println(30);
    }

    public static void main(String[] args) {
        ClassA aobj=new ClassA();
        aobj.method1();
    }
}

/*  1) catch block will executed only if there is an exception occures in try block.
        if there is no exception occured inside try block then catch block will never gets executed.
    2) Finally block will always get executed. finally block is used toclose the connections /resources.
* */
