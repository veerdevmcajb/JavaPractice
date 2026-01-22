package inheritance.singleLevel;

// super and this keyword

public class Parent1 {

    Parent1(){
        System.out.println("Parent 0 arguments constructor");
    }
}
class Child1 extends Parent1{

    Child1(){
        this(10); // ushing this keyword we are calling current class constructor
        System.out.println("Child 0 argumrnt constructor");
    }
    Child1(int a){
        super(); // using super keyword we are calling parent class constructor.
        System.out.println("Child 1 arguments Constructor");
    }

    public static void main(String[] args) {
        new Child1(); // when we create the obj constructor will call automatically.
    }
}
