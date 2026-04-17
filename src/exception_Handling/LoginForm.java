package exception_Handling;

import java.util.Scanner;

public class LoginForm {
//    String userName;
//    String password;
//
//    LoginForm(String userName, String password){
//        this.userName=userName;
//        this.password=password;
//    }

    public static void main(String[] args) {
        String userName;
        String password;

        Scanner sc=new Scanner(System.in);
        System.out.println("ENter a UserName");
        userName=sc.next();
        System.out.println("Enter a Password");
        password=sc.next();

        if(userName.equals("Admin") && password.equals("admin123")){
            System.out.println("Login Successful...!");
        }else{
            try {
                throw new InvalidPassword("Invalid Credientials... Try Again");
            } catch (InvalidPassword e) {
                System.out.println("Invalid Login Credationals... Plz try again..! ");
            }
        }

    }
}
