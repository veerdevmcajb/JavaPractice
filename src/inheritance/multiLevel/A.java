package inheritance.multiLevel;

public class A {

//    String name="GrandFather";
//    int age=80;
    long money=10000000l;
    void gen1(String name,int age){
        System.out.println("From Generation One");
        System.out.println("Name is " + name + " Age is " +age);
        System.out.println("GrandFather have a " + money + "money");
    }
}
