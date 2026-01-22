package abstraction;

public class ClassB extends ClassA{

    @Override
    void meth1() {
        System.out.println("abstract method override");
    }

    public static void main(String[] args) {
        ClassA obj=new ClassB();
        obj.meth1();
        obj.meth2();
        ClassA.meth3();
    }
}
