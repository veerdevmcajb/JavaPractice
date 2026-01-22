package polymorphism.methodOverloading;

public class Adder {

    public static int add(int a,int b){
        return a+b;
    }

    public static int add(int a,int b,int c){
        return a+b+c;
    }

    //
    static double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(Adder.add(10,20));   // 30
        System.out.println(Adder.add(25,75,100));   // 200
        System.out.println(Adder.add(45.5,18.5));   //64.0
    }
}

