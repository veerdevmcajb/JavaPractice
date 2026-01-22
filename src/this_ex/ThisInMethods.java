package this_ex;

public class ThisInMethods {

    void meth1(){
        System.out.println("meth1 Called");
        this.meth2();
    }
    void meth2(){
        System.out.println("meth2 called");
        this.meth3();
        // we can call static method using this keuword
        // But we cant use this keyword inside static area
    }

    static void meth3(){
        System.out.println("static meth3 called");
    }

    public static void main(String[] args) {
        new ThisInMethods().meth1();
        // this.meth1(); //CE-> But we cant use this keyword inside static area
    }
}
