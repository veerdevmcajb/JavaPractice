package Scanner;

import java.util.Scanner;

public class Test1 {
    Scanner sc=new Scanner(System.in);

    void meth1(){
        System.out.println("Enter 1st num");
        int a=sc.nextInt();
        System.out.println("Enter 2nd num");
        int b=sc.nextInt();
        System.out.println("Addition is "+(a+b));
    }

    int meth2(){
        System.out.println("PLZ Enter a num ro return from a method");
        return sc.nextInt();
    }


    void meth3(int a,int b){
        System.out.println("meth3 called");
        System.out.println("Multiplication value is "+(a*b));
    }

    void meth4(){
        System.out.println("Plz enter your name");
        sc.nextLine(); //
        String name=sc.nextLine();
        System.out.println("Name is " + name);
    }

    public static void main(String[] args) {
        Test1 t=new Test1();
        t.meth1();
        System.out.println(t.meth2());
        System.out.println("Enter 2 values for metod3");
        t.meth3(t.sc.nextInt(),t.sc.nextInt());
        t.meth4();
    }
}
