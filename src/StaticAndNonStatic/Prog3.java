package StaticAndNonStatic;

public class Prog3 {

    int a=25;
    int b=10;

    static void add(){
        Prog3 p=new Prog3();
        System.out.println("Addition is " + (p.a+ p.b) );
    }
    static void mul(){
        Prog3 p=new Prog3();
        System.out.println("Mult is " + (p.a * p.b) );
    }

    public static void main(String[] args) {
        add();
        mul();
    }

}
