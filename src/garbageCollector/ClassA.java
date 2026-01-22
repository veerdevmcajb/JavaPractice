package garbageCollector;

public class ClassA {

    void meth1(){
        System.out.println("Meth1() called");
        ClassA aobj=new ClassA();
        // (3rd) All the objects present inside the method
    }
    protected void finalize(){
        System.out.println("Garbage has been Collected..");
    }

    public static void main(String[] args) {
        ClassA obj1=new ClassA();
        ClassA obj2=new ClassA();
        obj1.meth1();

        obj1=null;  //(1st) if we are nullfying the reference.
       // obj1.meth1();   // Nullpointer Exception

        obj2=obj1; // (2nd) if we are assining the reference to another obj.

        System.gc();
    }
}
