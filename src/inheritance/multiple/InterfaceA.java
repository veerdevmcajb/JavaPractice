package inheritance.multiple;

// Q Diamond Problem in Interface
// when we have same method in both Interface then we have to override the method implementation in class .

public interface InterfaceA {

    default void show(){
        System.out.println("Show method from Interface A");
    }
}

interface InterfaceB{

    default void show(){
        System.out.println("show from interface B");
    }
}

class ClassC implements InterfaceA,InterfaceB{

    @Override
    public void show() {
        InterfaceA.super.show();
        InterfaceB.super.show();
    }

    public static void main(String[] args) {
        ClassC obj=new ClassC();
        obj.show();
    }
}
