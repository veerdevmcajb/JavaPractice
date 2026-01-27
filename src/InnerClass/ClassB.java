package InnerClass;

// Static Innerclass
public class ClassB {
    int a=10;
    static int b=20;

    static class InnerClass
    {
        void display(){
            System.out.println("I am from Inner class");
            System.out.println("Instance varible "+ new ClassB().a);
            System.out.println("Static variable "+ b);
        }
        static {
            System.out.println("Inner Class static Block");
        }

        InnerClass(){
            System.out.println("Inner Class Constructor");
        }

        public static void main(String[] args) {
            System.out.println("main () from Inner class");
            new InnerClass().display();
        }
    }

    static {
        System.out.println("Outer Class Static Block");
    }
    ClassB(){
        System.out.println("Outer class Constructor.");
    }

    public static void main(String[] args) {
        System.out.println("Main () From Outer Class");
    }
}

/*         When we run the InnerClass class output like Following
            Inner Class static Block --> 1) static Block
            main () from Inner class --> 2) main
            Inner Class Constructor  --> 3) constructor InnerClass
            I am from Inner class  ---> 4) display method
            Outer Class Static Block --> 5) Inside a display method we create a obj using new
            Outer class Constructor.
            Instance varible 10
            Static variable 20

            when we run the outer class output like this
            Outer Class Static Block
            Main () From Outer Class
*
* */