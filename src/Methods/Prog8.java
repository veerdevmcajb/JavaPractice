package Methods;

// Method Chaining Problem..

public class Prog8 {
    void method1(){
        System.out.println(10);
        System.out.println(64);
        System.out.println("End");
    }

    int method2(int a, int b, int c){
        System.out.println(a);
        Prog8 obj=new Prog8();
        String s=obj.method5(100,"JAva is awesome");
        System.out.println(s);
        return a-b;
    }

    String method3(String s, int b,int d)
    {
        System.out.println(b+d);
        return s;
    }
    int method4(int c, int k){
        System.out.println(k);
        Prog8 obj1=new Prog8();
        int result =obj1.method2(50,50,50);
        System.out.println(result);
        return k+10;
    }
    String method5(int a, String L){
        System.out.println(a+a);
        Prog8 obj2=new Prog8();
        String s= obj2.method3("HI",15,10);
        System.out.println(s);
        return L;
    }

    public static void main(String[] args) {
        Prog8 obj=new Prog8();
        System.out.println("START");
        int result=obj.method4(20,10);

        System.out.println(result);
        obj.method1();
    }
}
