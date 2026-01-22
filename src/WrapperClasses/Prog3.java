package WrapperClasses;

// AutoBoxing & Auto-unboxing

public class Prog3 {
    public static void main(String[] args) {
        //AutoBoxing - Automatic conversion of primitive to Wrapper Object  : valueOf()
        Integer x=10;
        System.out.println(x);

        // Auto-unboxing - Automatic conversion of wrapper obj to primitive :   xxxValue()
        double d=Integer.valueOf(100);
        System.out.println(d);

        //here we are using autoboxing & it internally uses valueOf()

        Integer i1=10;
        Integer i2=10;
        System.out.println(i1==i2); //true
        System.out.println(i1.equals(i2));  //true

        Integer x1=200;
        Integer x2=200;
        System.out.println(x1==x2); // false  == method always check reference
        System.out.println(x1.equals(x2));//true


        // compareTo() return int value.
        Integer j1=Integer.valueOf(10);
        Integer j2=Integer.valueOf(20);
        Integer j3=Integer.valueOf(20);

        System.out.println(j1.compareTo(j2));   //-1
        System.out.println(j2.compareTo(j1));   //1
        System.out.println(j2.compareTo(j3));   //0


        // conversion String to Primitive using Parsexxx()

        String k1="100";
        String k2="200";
        System.out.println(k1+k2);

        int num=Integer.parseInt(k1);
        float f=Float.parseFloat(k2);
        System.out.println(num);
        System.out.println(f);

        // The parent class is holding all child class objects

//        class Test{
//            void disp(Number n){
//                System.out.println(n);
//            }
//
//            public static void main(String[] args) {
//                Test t=new Test();
//                t.disp(Integer.valueOf(10));
//                t.disp(Float.valueOf(10.4f));
//
//                t.disp(10);
//                t.disp(10.4f);
//
//            }
//        }
    }

}
