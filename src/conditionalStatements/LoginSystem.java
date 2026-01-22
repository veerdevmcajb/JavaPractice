package conditionalStatements;

//username correct
//
//if yes → then check password correct

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        String user="Shiv";
        String pass="1234";

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Username");
        String un=sc.next();

        if(un.equals(user)){
            System.out.println("Enter Password");
            String pw=sc.next();

            if(pw.equals(pass)){
                System.out.println("Login Successful");
            }else {
                System.out.println("Incorrect Password");
            }
        }
        else {
            System.out.println("Invalid Username");
        }
    }
}
