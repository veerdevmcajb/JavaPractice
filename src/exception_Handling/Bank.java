package exception_Handling;

import java.util.Scanner;

//Custom Exception
public class Bank {
    public static void main(String[] args) {
        int balance=10000;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount");
        int wAmout=sc.nextInt();
        if(balance > wAmout){
            balance=balance-wAmout;
            System.out.println("Withdraw Successful..!");
        }else {
            throw new BadRequest("Insufficient Balance");
        }
    }
}

class BadRequest extends RuntimeException{
    BadRequest(String msg){
        super(msg);
    }
}
