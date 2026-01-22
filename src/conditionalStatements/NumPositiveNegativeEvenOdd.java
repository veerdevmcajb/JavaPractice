package conditionalStatements;

import java.util.Scanner;

// Check if Number is Positive, and if Positive check Even/Odd
public class NumPositiveNegativeEvenOdd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Num");
        int num=scan.nextInt();

        if(num>0){
            if(num %2==0){
                System.out.println(num +" NUm is positive and Even ");
            }else{
                System.out.println(num + " Num is Positive and Odd");
            }
        }
        else {
            System.out.println(num +" is Negative");
        }
    }
}
