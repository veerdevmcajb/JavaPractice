package cloneable;

public class ClassC {

    public static void main(String[] args) throws Exception
    {
        ClassA aobj1=new ClassA();
        ClassB bobj1=new ClassB();

        aobj1.a=100;
        aobj1.b=200;
        System.out.println(aobj1.a +" "+ aobj1.b);

        ClassA aobj2=aobj1;
        aobj2.b=9;
        System.out.println(aobj1.a + " "+ aobj1.b +" "+aobj2.b);

        ClassA aobj3=aobj2.show();
        aobj3.b=55;
        System.out.println(aobj1.a + " "+ aobj1.b +" "+aobj3.b);

        System.out.println("------------------------------------");
        ClassB bobj2=bobj1.display();

        bobj1.x=15;
        bobj1.y=25;
        bobj2.y=999;

        System.out.println(bobj1.x +" "+ bobj1.y +" "+ bobj2.y);

    }
}
