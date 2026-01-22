package conditionalStatements;

import java.util.Scanner;

//Even or Odd
public class Prog1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter NUm");
        int num=scan.nextInt();

        if(num%2==0)
            System.out.println("Num is Even");
        else
            System.out.println("NUm is Odd");

    }
}
