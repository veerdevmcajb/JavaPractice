package LoopingStatements.whileLoop;
import java.util.Scanner;

// WAP the guess value.?
public class NumberGuessGame {
    public static void main(String[] args) {

        int guess=45;
        Scanner scan=new Scanner(System.in);

        while (true){
            System.out.println("Enter a Guess num");
            int userGuessNUm=scan.nextInt();

            if(userGuessNUm > guess){
                System.out.println("You Enter a more than guess value...");
            } else if (userGuessNUm < guess) {
                System.out.println("You Enter a less than guess value...");
            }
            else {
                System.out.println("Your Guess is the Correct Congrations...!");
                break;
            }
        }
    }
}
