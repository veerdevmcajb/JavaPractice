package typecasting;

public class Prog1 {
    void implicit(){
        System.out.println("Performin the implicit typecasting");
        byte b=50;
        int i=b;

        System.out.println("byte value ==> "+b);
        System.out.println("int value ==> "+i);

        char c1='A';
        int x=c1; //ACSII

        char c2='a';
        int y=c2;

        System.out.println("Char value==> "+c1);    //A
        System.out.println("int value==> "+x);      //65
        System.out.println("int value==> "+y);      //97

        System.out.println("method1() is returning==> "+new Prog1().method1('a'));

        float f=b;
        System.out.println("float value is=> "+ f);

    }

    int method1(int a){
        System.out.println("Method1() called==> "+(a+3));
        return 'A';
    }

    void explicit(){
        System.out.println("performing explicite type casting ");
        int x=500;
        byte b=(byte) x;
        System.out.println("int value=> "+x);
        System.out.println("byte value=> "+b);


        float f=10.999f;
        byte b2=(byte) f;
        System.out.println("float value=> "+ f);
        System.out.println("byte value=> "+ b2);
    }

    public static void main(String[] args) {
        Prog1 obj=new Prog1();
        obj.implicit();
        System.out.println("--------------------------------");
        obj.explicit();
    }
}
