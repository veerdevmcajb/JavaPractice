package Methods;

public class Prog11 {

    int method1(){
        System.out.println("Hi");
        return new Prog11().method2() + 10 ;
    }

    int method2(){
        System.out.println("Hello");
        return 10;
    }

    public static void main(String[] args) {
        // we r creating a obj and calling a method with new keyword.
        System.out.println(new Prog11().method1());
    }
}
