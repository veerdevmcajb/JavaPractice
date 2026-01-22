package Methods;

public class Prog12 {
    String method1(int a, int b){   // calling from 4
        System.out.println(10);
        System.out.println((54+a)-b);
        int value=new Prog12().method5();
        System.out.println(value);
        return "Java";
    }

    int method2(int a){ // calling from 5
        System.out.println(75);
        int b=5;
        System.out.println(b-a);
        return (5*5)-b;
    }

    void method3(){         // calling from main
        System.out.println("Start");
        System.out.println(new Prog12().method4());
        System.out.println(40);
    }

    String method4(){   // calling from method 3
        System.out.println("Today is saturday");
        return new Prog12().method1(4,8);
    }

    int method5() { // calling from 1
        Prog12 obj=new Prog12();
        System.out.println(99);
        return obj.method2(5);
    }

    public static void main(String[] args) {
        Prog12 obj=new Prog12();
        obj.method3();
    }
}
