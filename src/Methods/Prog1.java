package Methods;

public class Prog1 {

    public void method2(){
        System.out.println("I am form method2");
    }

    public void method1(){
        System.out.println("I am from method 1");
        Prog1 p=new Prog1();
        p.method2();
    }
    public static void main(String[] args) {
        System.out.println("Main started");
        Prog1 p1 =new Prog1();
        p1.method1();
        p1.method2();
        System.out.println("Hello This is Main Method");
        System.out.println("Main Ended..");
    }
}
