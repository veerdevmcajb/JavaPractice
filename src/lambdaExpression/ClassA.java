package lambdaExpression;

public class ClassA {

    void display(){
        System.out.println("Implementing Lambda Expression");
        InterfaceA x=()-> System.out.println("Hello Lambda");
        x.meth1();

        InterfaceB y=(int a,int b)-> System.out.println("Addition is : "+ (a+b));
        y.meth2(10,5);

        InterfaceC z=(int o,int k)->{
            if(o<10)
                return o+10;
            else
                return k+20;
        };
        System.out.println("meth3 is returning "+ z.meth3(5,15));

    }

    public static void main(String[] args) {
        ClassA obj=new ClassA();
        obj.display();
    }
}
