package Constructor;

public class Demo {
    void method1(){
        System.out.println("Method1 is called()");
    }

    private Demo(String s){
        System.out.println(s);
    }

    public Demo(){
        System.out.println("default constructor");
    }
}
