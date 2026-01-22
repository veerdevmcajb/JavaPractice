package Encapsulation;

import java.util.Scanner;

public class BankAccount {
    private String accHolderName;
    private int accNumber;
    private  double balance;
    private int pin=1122;

    public BankAccount(String name,int accNo, double initialBalance){
        accHolderName=name;
        accNumber=accNo;
        balance=initialBalance;
    }

    public void deposit(double amount){

        if(amount >0){
            balance=balance+amount;
            System.out.println("Deposit is successful "+ amount);

        }else {
            System.out.println("Deposit failed");
        }
    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance=balance-amount;
            System.out.println("withdraw amount is " + amount);

        }
        else {
            System.out.println("Insufficient Balance ");
        }
    }

    public String getAccHolderName() {
        return accHolderName;
    }


    public double getBalance(){
        return balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public int getPin(){
        return pin;
    }

}


class Atm{
    public static void main(String[] args) {
        BankAccount obj=new BankAccount("Veer",123456,10000);
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("Enter a Pin");
        int upin=sc.nextInt();

        if(obj.getPin()==upin){

            do{
                System.out.println("---------------------------");
                System.out.println("Enter a choice ");
                System.out.println("1. deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Check Balance");
                System.out.println("4. check Acc Holder details");
                System.out.println("5. exit");
                choice=sc.nextInt();

                switch(choice){
                    case 1:
                        System.out.println("Enter deposit Amount ");
                        obj.deposit(sc.nextDouble());
                        break;

                    case 2:
                        System.out.println("Enter Withdraw Amount ");
                        obj.withdraw(sc.nextDouble());
                        break;

                    case 3:
                        System.out.println("Balance is : " + obj.getBalance());
                        break;

                    case 4:
                        System.out.println("Acc Holder Name is : " + obj.getAccHolderName());
                        System.out.println("Acc Num is : " + obj.getAccNumber());


                    case 5:
                       // System.exit(0);
                        sc.close();
                        break;

                    default:
                        System.out.println("Incorrect Input choice..");

                }
            }while(choice !=5);

        }else {
            System.out.println("Wrong Pin...");
            }

       // sc.close();

    }
}
