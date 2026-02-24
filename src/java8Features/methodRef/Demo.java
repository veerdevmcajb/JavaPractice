package java8Features.methodRef;

interface MyInterface{
    public void m1();
}
public class Demo {

    public static void m2(){
        System.out.println("Method 2 called...");
    }

    public static void main(String[] args) {
       // Demo.m2();

        MyInterface mi=Demo::m2;
        mi.m1();
    }
}
