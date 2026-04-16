package StaticAndNonStatic;

public class Parent {
    int a = 10;

//    Parent(int a) {
//        this.a = a;
//        System.out.println("Parent constructer" + a);
//    }

//    Parent(){
//        System.out.println("no-arg const ");
//    }


    static void save() {
        System.out.println("Save from parent method");
    }

    void run() {
        System.out.println("run from parent");
    }

    static void test() {
        System.out.println("test from parent ");
    }
}


class Child extends Parent {

    Child() {
        super();
    }

    static void save() {
        System.out.println("Save from child method");
    }

    @Override
    void run() {
        System.out.println("run method from child");
    }

    public static void main(String[] args) {

        Parent p = new Child(); // dynamic method dispatch or upcasting
        p.save(); // method Hide
        p.run();

        //Child c = (Child) new Parent(); // Downcasting  we cant do directly downcating

        Child c = new Child();
        c.save();


        Child c1 = new Child();
        c1.run();
        c1.save();
        c1.test();

    }

}
