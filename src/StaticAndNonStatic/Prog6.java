package StaticAndNonStatic;

public class Prog6 {
    static int x=Prog6.method1();

    static int method1(){
        System.out.println("Method 1 called");
        return 100;
    }

    public static void main(String[] args) {
        System.out.println("Main() called");
    }

    static {
        System.out.println("1st static block==> "+x);
    }
}
