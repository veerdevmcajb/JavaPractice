package java8Features.interfaceEx;

/*  - if we add new methods in interface then Car ,Bike and Bus will fail at compile time.
    - To Overcome above problem we will use default and static methods.

    1) Interface can have concrete methods .
    2) Interface concrete methods should be default or static.
    3) Interface Default methods we can override in implementation classes.
    4) Interface static methods we can't override in implementation classes.
    5) we can write multiple default & static methods in interface.
    6) Default & static methods introduced to provide backward compatability.
    ex. forEach() method added in java.util.iterable interface as default method() in 1.8v
    - if we want implementation classes to allow overriding concept
      of method then we can use default method .
    -
*
* */

interface Vehical {
   public void start();
    default void clean(){
        System.out.println("Cleaning completed");
    }

    public static void run(){
        System.out.println("car is Running");
    }

}
class Car{
   public void start(){
       System.out.println("Car is Started...");
    }

    public static void main(String[] args) {
        Car c=new Car();
        c.start();
        c.start();
        Vehical.run();
    }
}

class Bike implements Vehical{
    public void start(){
        System.out.println("Bike Started...");
    }

}
