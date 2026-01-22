package conditionalStatements;

import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int pin=1234;
        int attempts=0;
        double balance=20000;


        while(attempts < 3) {
            System.out.println("Enter a Pin : ");
            int upin = sc.nextInt();

            if (pin == upin) {
                System.out.println("Welcome");
                break;
            } else {
                attempts++;
                System.out.println("Incorrect Pin ! Attempts Left " + (3 - attempts));
            }
        }


            if(attempts == 3){
                System.out.println("You enter a too many wrong pin your card is Blocked..!");
                return;
            }

            int choice;
            do{
                System.out.println("ATM Menu");
                System.out.println("1. Check Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Deposit money");
                System.out.println("4. Transfer money");
                System.out.println("5. Change Pin");
                System.out.println("6. Exit");
                System.out.println("Enter Your choice");
                choice=sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Your Current balance is :"+ balance);
                        break;

                    case 2:
                        System.out.println("Enter Amount to withdraw : ");
                        double withdrawAmt=sc.nextDouble();

                        if(withdrawAmt <= balance){
                            balance= balance-withdrawAmt;
                            System.out.println("Withdrawal Successful!");
                            System.out.println("Remaining Balance : "+ balance);
                        }
                        else {
                            System.out.println("Insufficient Balance!");
                        }
                        break;


                    case 3:
                        System.out.println("Enter Amount to deposit");
                        double depositAmt=sc.nextDouble();

                        balance= balance + depositAmt;
                        System.out.println("Deposit Successful!");
                        System.out.println("New Balance is : "+ balance );
                        break;

                    case 4:
                        System.out.println("Enter  amount to transfer");
                        double transferAmt= sc.nextDouble();

                        System.out.println("Enter Receiver Account Number");
                        long acc=sc.nextLong();

                        if(transferAmt <= balance) {
                            balance=balance - transferAmt;
                            System.out.println("Transfer Successful");
                            System.out.println("Amount Transfer to : " +acc);
                            System.out.println("Remaining Balance : " + balance);
                        }
                        else {
                            System.out.println("Insufficient Balance ");
                        }
                        break;
                    case 5:
                        System.out.println("Enter current pin");
                        int oldPin=sc.nextInt();

                        if(oldPin == pin){
                            System.out.println("Enter new pin");
                            int newPin=sc.nextInt();

                            System.out.println("Conform new pin");
                            int confPin=sc.nextInt();

                            if(newPin == confPin) {
                                pin=newPin;
                                System.out.println("Pin changed successfully");
                            }else {
                                System.out.println("Pin MissMatch try again");
                            }
                        }
                        else {
                            System.out.println("Incurrent  current pin");
                        }
                        break;

                    case 6:
                        System.out.println("Thank You...! ");
                        break;

                    default:
                        System.out.println("Invalid Choice ! plz try again");
                }
            }while (choice !=6);
    }
}
