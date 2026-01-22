package Interface;

public interface InterfaceA {

    void meth1();// abstract method

    static void meth2(){ // concreate method
        System.out.println("I am static method in interface");
        System.out.println("I am avaliable from java 1.8");
    }

    default void meth3(){
        System.out.println("I am default method in Interface");
        System.out.println("I am avaliable from java 1.8");
        System.out.println("----------------------");
        this.meth4();
    }
    private void meth4(){
        System.out.println("I am private method in Interface");
        System.out.println("I am avaliable from Java 1.9");
    }

    public static void main(String[] args) {
        System.out.println("main() called from Interface");
        InterfaceA.meth2();
    }
}
