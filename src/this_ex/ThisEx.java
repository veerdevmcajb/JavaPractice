package this_ex;

public class ThisEx {
    int a=10;
    static int b=20;
    int x;

    ThisEx(){
        System.out.println("o arg constructor");
        // this(100);  // this is not allowed
    }
    ThisEx(int x){
        System.out.println(x);
    }
    void method1(){
        int a=30;
        System.out.println("Instance var "+this.a); //we can use a instance var using this
        this.x=25; // this is allowed
        System.out.println(x);
        System.out.println("Static var "+b);    // diarectl
        System.out.println("Static var "+ThisEx.b); // class name
        System.out.println("Local var "+a);

    }

    public static void main(String[] args) {
        ThisEx obj=new ThisEx();
        obj.method1();
    }
}
