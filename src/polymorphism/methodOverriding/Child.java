package polymorphism.methodOverriding;

public class Child extends Parent{

    public void bike(){
        System.out.println("Child have a KTM Bike");
    }

    public static void main(String[] args) {
        Child c=new Child();
        c.bike();
         Parent p=new Parent();
         p.bike();
    }
}
