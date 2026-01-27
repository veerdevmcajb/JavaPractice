package InnerClass;

public class InnerClass {
    static OuterClass out=new OuterClass()

    {
        void print()
        {
             super.print();
            System.out.println("I am a Anonymous class");
        }
    };

    public static void main(String[] args) {
        out.print();
    }
}
