package StaticAndNonStatic;

public class Prog5 {
    int x=10;
    static int y=20;

    void method1(){
        System.out.println("Instance var "+ x);
        System.out.println("static var "+ y);
    }

    static void method2(){
        System.out.println("Instance var=> "+ new Prog5().x);
        System.out.println("Static var=> "+ y);
    }

    public static void main(String[] args) {
        Prog5 obj=new Prog5();
        obj.method1();
        System.out.println("-------------------");

        obj.method2(); // accessing with class obj
        method2();// accessing with identifier

        Prog5.method2(); // accessing with class name

        //Prog5.method1();//C.E because instance methods cant be called with the help of class name
    }
}
