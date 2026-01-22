package abstraction;

public abstract class ClassA {
    abstract void meth1();

    void meth2(){
        System.out.println("Meth2() called ");
    }

    static void meth3(){
        System.out.println("static meth3() called..");
    }
    ClassA(){
        System.out.println("abstract class constructor..");
    }

    public static void main(String[] args) {
        System.out.println("Class main() called ");
        ClassA.meth3();
    }
}
