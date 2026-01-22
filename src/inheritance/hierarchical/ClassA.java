package inheritance.hierarchical;

// Hierarchical Inheritance --> one parent class have multiple child classes.



public class ClassA {

    public void meth1(){
        System.out.println("Class A method");
    }
}

class ClassB extends ClassA{
    public static void main(String[] args) {
        new ClassB().meth1();
    }
}

class ClassC extends ClassA{
    public static void main(String[] args) {
        new ClassC().meth1();
    }
}
