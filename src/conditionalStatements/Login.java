package conditionalStatements;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter UserName");
        String userName=scan.next();
        System.out.println("Enter Password");
        String passWord=scan.next();

        String name="Shivanand";
        String pass="Shiv123";

        if(name.equals(userName) && pass.equals(passWord)){
            System.out.println("login Successful");
            System.out.println("Welcome...!");
            System.out.println("Have a Great Day Shiv..!");
        }
        else{
            System.out.println("Login Failed");
            System.out.println("Invalid userName and PassWord");
        }
    }
}
