package conditionalStatements;

//Take marks from user:
//
//If marks ≥ 35 → Pass
//
//If Pass and marks ≥ 75 → Distinction
//
//Else → Fail

import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks");
        int marks=sc.nextInt();

        if(marks>=35){

            if(marks >=75){
                System.out.println("Pass with Distinction");
            }
            else {
                System.out.println("Pass");
            }
        }
        else {
            System.out.println("Fail...");
        }
    }

}
