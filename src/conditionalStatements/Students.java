package conditionalStatements;

import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Student Name");
        String name=scan.next();
        System.out.println("Enter Math marks");
        int math=scan.nextInt();
        System.out.println("Enter Sci marks");
        int sci=scan.nextInt();
        System.out.println("Enter Social marks");
        int social=scan.nextInt();

        char grade=' ';

        int totalMarks= math+sci+social;
        System.out.println("Total marks " + totalMarks);
        float per=totalMarks/3;
        System.out.println("percentage is " +per);

        if(per>=70){
            grade='A';
            System.out.println("grade is "+ grade+" PASS");
        } else if (per>=60 && per <69) {
            grade='B';
            System.out.println("grade is "+grade +" PASS");
        } else if (per>=50 && per <59) {
            grade='C';
            System.out.println("grade is "+ grade+" PASS");
        } else if (per>=40 && per<49) {
            grade='D';
            System.out.println("grade is "+ grade+" PASS");

        } else if (per<40) {
            System.out.println("Sorry You Are Fail...");
            grade='F';
        }
        System.out.println("Hi "+name +" Your marks is "+ totalMarks + " your percentage is " + per +" your grade is " + grade);
    }
}
