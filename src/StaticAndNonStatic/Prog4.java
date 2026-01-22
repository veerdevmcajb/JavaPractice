package StaticAndNonStatic;

public class Prog4 {
    static int count;// there is only one copy for static var
    int x;  // for every instance a separate copy wil be created

    Prog4(){
        count++;
        x++;
        System.out.println(count);
        System.out.println(x);
        System.out.println("********************");
    }

    public static void main(String[] args) {
        new Prog4();
        new Prog4();
        new Prog4();
        // System.out.println(x); we can't
    }
}
