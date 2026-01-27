package exception_Handling;

import java.util.Scanner;

public class CustomException {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age");
        int age=sc.nextInt();
        if(age>18){
            System.out.println("You are eligible for Vote");
        }else {
            throw new InvalidAge("Try after sometime");
        }
    }

}

class InvalidAge extends RuntimeException{
    InvalidAge(String msg){
        super(msg);
    }
}
