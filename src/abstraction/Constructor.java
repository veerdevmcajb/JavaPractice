package abstraction;

// we can create a abstract class constructor
// inside the abstract class it is possible to declare the vaiables,methods,blocks.
public class Constructor {

    Constructor(){

        System.out.println("abstract class constructor");
    }
}

class Demo extends Constructor{
    Demo(){
        System.out.println("Demo class constructor");
    }

    public static void main(String[] args) {
        new Demo();
    }
}
