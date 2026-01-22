package conditionalStatements;

import java.util.Scanner;
/*
* Employee gets:
20% bonus if salary > 50000
10% bonus otherwise*/

public class EmployeeBonus {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Salary");
        double salary=sc.nextDouble();
        double bonus;

        if(salary > 50000){
            bonus=salary * 0.20;
        }
        else {
            bonus=salary * 0.10;
        }
        System.out.println("Bonus is "+ bonus);
        System.out.println("sal with Bonus is " + (salary + bonus));
    }
}
