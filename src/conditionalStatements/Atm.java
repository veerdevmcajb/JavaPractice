package conditionalStatements;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        int balance=20000;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Amount");
        int amount=sc.nextInt();

        if(balance > amount){
            balance=balance-amount;
            System.out.println("Withdrawal is Successful plz collect your Money");
            System.out.println("Your Remaining Balance is " + balance);
        }
        else {
            System.out.println("Insufficient Balance");
        }
    }
}
