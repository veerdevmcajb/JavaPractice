package polymorphism.methodOverriding;

// Example of covariant return type.


public class A {
   public  Object print(){
        System.out.println("Parent cls print method");
        return new Object();
    }

    public String msg(){
       return "Hello ";
    }


}

class B extends A{

    public A print(){
        System.out.println("Print method of class B");
        return new A();
    }

    public String run(){
        System.out.println("run method");
        return new String("");
    }

    public static void main(String[] args) {
        B obj1=new B();
        obj1.print();
        System.out.println(obj1.msg());

        A obj2=new B();
        obj2.print();
        obj2.msg();
        // obj2.run(); // CE
    }
}

//  While overriding a method, the child class can return a subtype of parent class method returntype .
