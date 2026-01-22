package polymorphism.methodOverloading;

// Method Overloading - Same method name with different formal arguments.
// we can create a no of methods in a class.
// method overloading is a example of compile time polymorphism.
// Method overloading just check the method signature and overload method have a diffe return type.


public class Test {

    public void sum(int a){
        System.out.println("sum is : "+ (0+a));
    }

    public void sum(int a,int b){
        System.out.println(" sum is : "+(a+b));
    }

    public void mult(int x,int y){
        System.out.println("Mult is "+(x*y));
    }

    public void mult(double d1,double d2){
        System.out.println("mult of double values is "+ (d1*d2));
    }

    public static void main(String[] args) {

            Test t=new Test();
            t.sum(10);
            t.sum(25,65);
            t.mult(10,10);
            t.mult(2.5,4);


    }
}
