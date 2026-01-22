package Constructor;

/**
 * Create 3 classes:
 * GrandParent
 * Parent
 * Child
 * Each has a constructor printing its name.
 * Create Child object and observe order.*/

public class Problem8 {

    Problem8(){
        System.out.println("This is a GrandParent Constructor");
    }
}

class Parent extends Problem8{

    Parent(){
        System.out.println("This is a Parent constructor");
    }

}

class Child1 extends Parent{

    Child1(){
        System.out.println("This is a child constructor");
    }

    public static void main(String[] args) {
        Child1 obj=new Child1();
    }
}
