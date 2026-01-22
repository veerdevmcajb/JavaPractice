package Methods;

public class Prog3 {

    void method1(){
        System.out.println("Method1 is called");
    }

    public static void main(String[] args) {

        Prog3 obj=new Prog3();
        obj.method1(); // we can call a method like this

        new Prog3().method1(); // we can call a method like this also but there is new ob created with new keyword

        int a=1;int b=2;
        int c; int d;
        c=++b; // 3
        d=a++; // d is 1  -> a is- 2
        c++;  // 4
        System.out.println("a="+a); //2
        System.out.println("b="+b); // 3
        System.out.println("c="+c); // 4
        System.out.println("d="+d); // 1


    }
}
