package lambdaExpression.MethodReferencing;

public class ClassA {
    void display(){
        System.out.println("Method Referencing");

//        InterfaceA x=()-> System.out.println("hello");

        InterfaceA x=new ClassB()::show; // method referencing
        x.meth1();

        InterfaceA y=ClassB ::show2; // static method referencing
        y.meth1();

        InterfaceA z=ClassB::new; // constructor referencing
        z.meth1();
    }

    public static void main(String[] args) {
        ClassA obj=new ClassA();
        obj.display();
    }
}
