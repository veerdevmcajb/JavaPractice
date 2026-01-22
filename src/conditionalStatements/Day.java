package conditionalStatements;

import java.util.Scanner;

public class Day {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Day");
        String day=scan.next();

        switch (day){
            case "mon",
                "Tue",
                 "wed":
                System.out.println("The Discount is 5%");
                break;


            case "thr",
                 "fri":
                System.out.println("The Discount is 4% ");
            break;

            case "sun":
                System.out.println("The discount is 3%");
                break;

            default:
                System.out.println("Error Plz Enter Right Day");
        }
    }
}
