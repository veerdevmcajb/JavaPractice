package WrapperClasses;

// convertin primitive or strong to ----> Wrapper obj

public class Prog1 {
    public static void main(String[] args) {
        Integer i1=new Integer(10);
        Integer i2=new Integer("10");
        System.out.println(i1 + i2);

        Integer x1= Integer.valueOf(10);
        Integer x2=Integer.valueOf("10");
        System.out.println(x1+x2);

//        Integer i=new Integer("ten");
//        Integer x=new Integer.valueOf("ten"); // NumberFormat Exception
    }
}
