package Constructor;

/**Create a class with:
 private constructor
 create object inside same class*/

public class Problem9 {
        private Problem9(){
            System.out.println("This is a private constructor");
        }

    public static void main(String[] args) {
        Problem9 obj=new Problem9();

    }
}
