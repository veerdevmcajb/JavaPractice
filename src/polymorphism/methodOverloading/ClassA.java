package polymorphism.methodOverloading;

public class ClassA {

    public final void meth1(){
        System.out.println(10);
    }

    private int meth1(int a){
        System.out.println(20);
        return a;
    }

    protected final void meth1(int a,int b){
        System.out.println(30);
    }

    String meth1(String s,int a){
        System.out.println(40);
        return s;
    }

    void meth1(int a,String s){
        System.out.println(50);
    }

    public static void main(String[] args) {
        ClassA obj=new ClassA();
        obj.meth1();
        obj.meth1(10);
        obj.meth1(10,20);
        obj.meth1("Veer",30);
        obj.meth1(10,"java");
        ClassA.main("abc");
        main(01);
    }


    public static void main(String s){
        System.out.println("main method with string");
    }

    public static void main(int a){
        System.out.println("we can overload any method in java");
    }


}
