package inheritance.singleLevel;

public class ClassA {

    void meth1(){
        System.out.println("Parent class method");
    }
}

class ClassB extends ClassA{
    void meth2(){
        System.out.println("child class method");
    }

    public static void main(String[] args) {

        ClassA obj1=new ClassA(); // parent class obj
        obj1.meth1();
        System.out.println("---------");

        ClassA obj2=new ClassB();
        obj2.meth1();
        // obj.method2(); // C.E
        System.out.println("--------------");

        ClassB obj3=new ClassB(); // is a relationship
        obj3.meth2(); // child cls method
        obj3.meth1(); // parent cls method

        //ClassB obj4=new ClassA();//Invalid C.E
    }
}