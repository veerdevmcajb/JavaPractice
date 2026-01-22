package Methods;

// Method Parameter - (Method with parameter is called as method parameter)
public class Prog2 {

    public void method1(int a){
        System.out.println("from method 1");
        System.out.println("a value is "+a);
    }


    public void method2(int a, String b) {
        System.out.println("From method 2");
        System.out.println("a value of a is "+a);
        System.out.println("a value of b is "+b);
    }

    public static void main(String[]args){
        System.out.println("Main started");
       Prog2 obj =new Prog2();
       // obj.method1();  CE
        obj.method1(50);
        // obj.method2("shiv",01);      CE because steps don't follow.
        obj.method2(01,"Shiv");
        System.out.println("Main End");
    }
}
