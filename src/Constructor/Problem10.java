package Constructor;

//Write a constructor that calls a method which prints a message.

public class Problem10 {
    Problem10(){
        method1();
    }

    void method1(){
        System.out.println("This Method is calling from a constructor ");
    }

    public static void main(String[] args) {
        Problem10 obj=new Problem10();

    }
}
