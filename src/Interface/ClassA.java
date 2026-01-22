package Interface;

public class ClassA extends ClassB implements InterfaceA,InterfaceB{
    public void meth1(){
        System.out.println("Interface A abstract method implementation ");
    }
    public void show(){
        System.out.println("Interface B abstract method implementation");
    }

    public static void main(String[] args) {
        InterfaceA aobj=new ClassA();
        aobj.meth1();
        aobj.meth3();// calling default method

        InterfaceB bobj=new ClassA();
        bobj.show();
        new ClassA().display();
    }
}
