package WrapperClasses;

// Wrapper to primitive
// Wrapper to String

public class Prog2 {
    public static void main(String[] args) {

        //Wrapper to primitive
        Integer x=Integer.valueOf(100);
        int a=x.intValue();
        double d= x.doubleValue();
        System.out.println(a+d); //200.0


        // Wrapper object to string

        Integer x1=Integer.valueOf(100);
        Integer x2=Integer.valueOf(100);
        String s1=x1.toString();
        String s2=x2.toString();
        System.out.println(s1+s2); //100100
    }
}
