package conditionalStatements;

import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter num");
        int num=scan.nextInt();

        if(num>0){
            System.out.println(num+"is Positive");
        }
        else{
            System.out.println(num+" is Negative");
        }
//        if(num%2==0){
//            System.out.println(num+" is Even");
//        }
//        else {
//
//            System.out.println(num+" is Odd");
//        }

        String res=(num%2==0 ?"even":"Odd");
        System.out.println(res);
    }
}
