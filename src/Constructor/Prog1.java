package Constructor;

public class Prog1 {

        void meth1()
        {
            System.out.println("meth1() called");
        }
        void meth2(int a)
        {
            System.out.println("meth2()+ called==>"+a);
        }
        Prog1()
        {
            new Prog1(1000);
            System.out.println("Non Para Constructor");
            new Prog1(999).meth2(500);
        }
        Prog1(int a)
        {
            System.out.println("Parameterized constructor====>"+a);
        }
        public static void main(String[] args) {
            System.out.println("Start");
            new Prog1().meth1();
            System.out.println("End");
        }
    }

