package lambdaExpression.MethodReferencing;

public class ClassB {
    void show(){
        System.out.println("Implementing method refercing");
        System.out.println("Implementing method refercing using Lambda");
    }

    static void show2(){
        System.out.println("This is static method");
    }

    ClassB(){
        System.out.println("Constructor Refercing ");
    }
}
