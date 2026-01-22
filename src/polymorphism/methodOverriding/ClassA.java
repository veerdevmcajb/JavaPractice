package polymorphism.methodOverriding;

public class ClassA {

    void meth1(){
        System.out.println("ClassA meth1 called");
    }
}

class ClassB extends ClassA{

    void meth1(){
        System.out.println("ClassB meth1 called");
    }

    public static void main(String[] args) {
        ClassA obj1=new ClassB();
        obj1.meth1(); // meth present in classB

        ClassA obj2=new ClassA();
        obj2.meth1(); //meth present in classA

    }
}
