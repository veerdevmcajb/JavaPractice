package inheritance.multiLevel;

public class B extends A{

    String name="Veer";
    int age=25;

    void gen2(String name, int age){
        System.out.println("From generation 2");
        System.out.println(" Name is "+ name + " & Age is " + age);
        System.out.println("Father have A Gov Job and Car");
    }
}
