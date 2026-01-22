package Methods;

public class Prog9 {

    int method1(int a, int b, char c) // a=10, b=20, c=x
     {
        System.out.println(c);                                 // 88
        int result=new Prog9().method2("Java",100,'Y');
        return 10 + a + result;
    }
    int method2(String s, int a, char c) {
        System.out.println(s);                                             // java
        System.out.println(c);                                             // Y
        return 20;
    }

    public static void main(String[] args) {
        System.out.println(new Prog9().method1(10,20,'X'));         // 40
    }
}


//c=
//java
// y
//40
//