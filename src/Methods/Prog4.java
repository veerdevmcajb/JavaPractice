package Methods;

public class Prog4 {

    void method1(int a){
        System.out.println(a);
    }

    void method2(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {

        Prog4 obj=new Prog4();
        obj.method1(100);
        obj.method2("Shiv");

        // another way but it is creating a new objects
        new Prog4().method1(200);
        new Prog4().method2("Veer");
    }



}
