package Methods;

// method with return type

public class Prog6 {

    public String method1(){
        System.out.println("Method1() is called..");
        return "String Return type";
    }
    public static void main(String[] args) {
        Prog6 obj=new Prog6();
        obj.method1();
        System.out.println(obj.method1());
    }
}
