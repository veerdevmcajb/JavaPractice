package string;

public class Example1 {

    void meth1(){
        String s1="java";
        String s2=new String("java");
        char arr[]={'j','a','v','a'};
        String s3=new String (arr);
        String s4=new String(arr,1,2);

        System.out.println("s1--> "+s1);
        System.out.println("s2--> "+s1);
        System.out.println("s3--> "+s1);
        System.out.println("s4--> "+s1);
    }

    void  meth2(){
        String s="java";
        System.out.println(s);
        s=s.concat(" is awesome");
        System.out.println("s value after concat "+s);
    }
    public static void main(String[] args) {
        Example1 obj=new Example1();
        obj.meth1();
        obj.meth2();
    }
}
