package StaticAndNonStatic;

public class Prog2 {

    static  int a=15;
    static  int b=25;

    static  void add(){
        System.out.println("Addition is " + (Prog2.a+Prog2.b));
    }
    static void mult(){
        System.out.println("Mult is "+ (Prog2.a * Prog2.b));
    }

    public static void main(String[] args) {
        add();
        mult();
    }

}
