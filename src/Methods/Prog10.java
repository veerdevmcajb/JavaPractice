package Methods;

import java.util.Scanner;

public class Prog10 {
    Scanner scan=new Scanner(System.in);

    int a;
    int b;

    Prog10(){
        System.out.println("Enter a num");
        a=scan.nextInt();

        System.out.println("Enter b num");
        b=scan.nextInt();
    }

    void add(){
        System.out.println("Addition is "+ (a+b));
    }

    void mult() {
        System.out.println("Mult is "+ (a*b));
    }

    public static void main(String[] args) {
        Prog10 obj = new Prog10();
        obj.add();
        obj.mult();
    }
}
