package Constructor;

public class Calculator {

    Calculator(){
        this(10);
        System.out.println("NO-Argument const");
    }

    Calculator(int a){
        this(10,20);
        System.out.println("One Paramether const "+ a);
    }

    Calculator(int a,int b){
        System.out.println("two parameter const "+(a+b));
    }

    public static void main(String[] args) {
        Calculator c=new Calculator();

    }
}
