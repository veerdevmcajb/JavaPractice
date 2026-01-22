package Methods;

public class Prog5 {

    public int method1(int a){
        System.out.println("HI");
        return 100+a;
    }

    public void method2(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Prog5 obj=new Prog5();
        int res=obj.method1(100);
        System.out.println(res);

        obj.method2();
    }
}
