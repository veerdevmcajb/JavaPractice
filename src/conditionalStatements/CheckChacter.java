package conditionalStatements;

import java.util.Scanner;

public class CheckChacter {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Character");
        char ch=scan.next().charAt(0);

        if(ch== 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
           ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
            System.out.println("Character is Vovels..");
        }else{
            System.out.println("Character is a Consonant");
        }
    }
}
