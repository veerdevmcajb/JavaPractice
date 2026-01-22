package StaticAndNonStatic;

public class Static_block {
    final static int x;
    static {
        x=50;
        System.out.println("1st static block==> "+x);
    }

    public static void main(String[] args) {
        System.out.println("Main method");
    }
    static {
        System.out.println("2nd static block => "+x);
    }

}
