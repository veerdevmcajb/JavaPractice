package this_ex;

public class ThisEx2 {

    ThisEx2 meth1(){
        System.out.println("meth1 called");
        return this;
    }

    ThisEx2 meth2(){
        System.out.println("meth2 called");
        return this;
    }

    void meth3(){
        System.out.println("met3 called");
    }

    public static void main(String[] args) {
        new ThisEx2().meth1().meth2().meth3();
    }
}
