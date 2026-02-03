package collections.generics;

// This type of class will take any type of object.

public class ClassA <T>{ // T -> means Type
    T obj;
    public void m1(T arg){
        System.out.println(arg);
    }

    public static void main(String[] args) {
        ClassA c=new ClassA();
        c.m1(10);
        c.m1("Hi");
        c.m1(100.51);
        c.m1(true);
    }
}
