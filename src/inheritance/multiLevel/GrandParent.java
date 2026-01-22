package inheritance.multiLevel;

import inheritance.singleLevel.Parents;

public class GrandParent {

    public void meth1(){
        System.out.println("GrandParent method");
    }
}

class Parent extends GrandParent{

    public void meth2(){
        System.out.println("Parent class method..");
    }
}

class Child extends Parent{
    public void meth3(){
        System.out.println("Child class method");
    }

    public static void main(String[] args) {
        Child obj=new Child();
        obj.meth3();
        obj.meth1();
        obj.meth1();
    }
}
