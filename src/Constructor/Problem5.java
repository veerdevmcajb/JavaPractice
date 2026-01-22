package Constructor;

/**Create a class with only parameterized constructor.
 Try creating an object without passing parameters.*/

public class Problem5 {
    int a;
        Problem5(int a){
            this.a=a;
            System.out.println(a);
        }

    public static void main(String[] args) {
        Problem5 p=new Problem5(1);
    }
}
