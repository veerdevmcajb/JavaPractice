package InnerClass;

public class ClassA {

    ClassA(){
        System.out.println("Outer class Constructor..");
    }

    void meth1(){
        System.out.println("I Am from outer class.");
    }

    class InnerClass{
        InnerClass(){
            System.out.println("Inner class Constructor");
        }
        void meth2(){
            System.out.println("I am from Inner class");
            System.out.println("we can use all the access modifier for Inner class");
            meth1();
        }
        // we can write a main method inside Inner class only if it is static.
    }

    public static void main(String[] args) {
        ClassA.InnerClass obj=new ClassA().new InnerClass();
        obj.meth2();
    }
}
