package Constructor;

/**
 * Write a program where:
 *
 * constructor initializes values
 *
 * method displays values
 */


public class Problem4 {
    int a;
    Problem4(int a){
        this.a=a;
    }
    void show(){
        System.out.println("a value is "+ a);
    }

    public static void main(String[] args) {
        Problem4 p= new Problem4(25);
        p.show();
    }
}
