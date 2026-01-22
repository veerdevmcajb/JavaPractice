package conditionalStatements;
import java .util.Scanner;

// Take a input form user and check it is Leap Year or Not...

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a Year");
        int num=scan.nextInt();

        if(num %400==0 ){
            System.out.println("It's a Leap Year");
        }
        else if (num%100==0) {
            System.out.println("It's not a Leap Year " );
        }
        else if (num %4==0) {
            System.out.println("It's a Leap Year");
        }
        else {
            System.out.println("It's not a Leap Year");
        }
    }
}
