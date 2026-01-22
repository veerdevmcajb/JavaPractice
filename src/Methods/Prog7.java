package Methods;

public class Prog7 {

    int method1(int a, int b){
        System.out.println(50);
        Prog7 obj=new Prog7();
        System.out.println(45);
        int x=obj.method2(100,"java");
        System.out.println(x+1);
        return a+b;
    }

    int method2( int a, String s){
        System.out.println(a+a);
        System.out.println(65);

        System.out.println(s);
        return a;

    }

    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println(new Prog7().method1(10,20)+100);
        System.out.println("End");
    }
}
