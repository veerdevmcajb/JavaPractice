package conditionalStatements;

import java.util.Scanner;
//Take temperature:
//If > 30 → Hot
//If 15–30 →
//If > 25 → Warm
//Else → Cool
//Else → Cold
public class TempCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temp");
        int temp=sc.nextInt();

        if(temp>30){
            System.out.println("Hot");
        } else if (temp >=15) {
            if(temp>=25){
                System.out.println("Warm");
            }
            else {
                System.out.println("Cold");
            }
        }
        else {
            System.out.println("COld");
        }
    }
}
