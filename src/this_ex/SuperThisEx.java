package this_ex;

public class SuperThisEx {

    void meth1(){
        System.out.println(" Class A method");
    }

    SuperThisEx(){
        System.out.println("Class A default constructor");
    }

    SuperThisEx(String s){
        this();
        System.out.println(s);
    }
}

class ClassB extends SuperThisEx{

    void meth2(){
        System.out.println("Class B method");
        super.meth1(); // super keyword
    }

    void meth3(){
        System.out.println("Method 3 called");
    }

    ClassB(){
        super("Java is Awesome");
        System.out.println("Class B  default construtor ");
        super.meth1();
        this.meth3();
    }

    ClassB(int a){
        System.out.println("Class B Parametrized constructor :"+a);
    }

    public static void main(String[] args) {
        ClassB obj=new ClassB();
        obj.meth2();
    }


}

// super keyword and super() constructor both are different
// we can use this and super keywords inside a constructor.
//  this and super keyword we cannot use inside a static area.
