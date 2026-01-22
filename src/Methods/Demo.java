package Methods;

public class Demo {
    Demo(){
        System.out.println("constructor");
    }
void meth1(){
    System.out.println("meth1");
}
void meth2(){
    meth1();
    System.out.println("meth2");
}

    public static void main(String[] args) {
        Demo d=new Demo();
        System.out.println(d);

        String s1="Natha";
        System.out.println(s1);

        StringBuffer sb=new StringBuffer("Natha Bhau");
        System.out.println(sb.equals("natha"));

        Integer i=10;
        System.out.println(i);

        //d.meth2();
    }
}
