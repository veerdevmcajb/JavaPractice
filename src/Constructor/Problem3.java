package Constructor;

/**
 * Create a class with:
two constructors (no-arg and parameterized)
create objects using both constructors */

public class Problem3 {
    Problem3(){
        System.out.println("No arument const");
    }

    Problem3(int a){
        System.out.println("Parameterized const"+ a);
    }

    public static void main(String[] args) {
        Problem3 p=new Problem3();
        Problem3 p1=new Problem3(10);
    }
}
