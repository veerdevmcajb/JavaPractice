package LoopingStatements.forLoop;

import java.util.Scanner;

// in application take a pin 1234
//Take a pin from user
// if pin is match print msg pin is valid. and stop the execution .
// if the pin is invalid take a pin again : take a input 4 attempts after
public class Assignment4 {
    public static void main(String[] args) {

        int pin=1234;

        for(int i=1; i<=4; i++){

        System.out.println("Enter a pin");
        Scanner scan=new Scanner(System.in);
            int userPin=scan.nextInt();
            if(pin == userPin) {
                System.out.println("Congratulations pin is valid ..😊");
                break;
            }
            else {
                if(i<4) {
                    System.out.println("pin is invalid Enter pin again...");

                }else{
                    System.out.println("Bye Bye Your Account is Blocked....!😁");
                }
            }
        }

    }
}
