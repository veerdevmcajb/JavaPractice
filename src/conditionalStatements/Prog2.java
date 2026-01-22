package conditionalStatements;

import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two num");
        int a=scan.nextInt();
        int b=scan.nextInt();

        if(a>b){
            System.out.println(a+" is Bigger");
        }
        else {
            System.out.println(b + " is Bigger");
        }
    }
}
