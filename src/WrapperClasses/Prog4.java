package WrapperClasses;

import inheritance.multiLevel.B;

public class Prog4 {

    void method1(){
        int i=50;
        Integer ival=Integer.valueOf(i);
        System.out.println("PDT value is :"+i); // primitive datatype
        System.out.println("WCO value is :"+ival); // Wrapper cls object

        // primitive to wrapper class
        long l=100l;
        Long lval=Long.valueOf(l);
        System.out.println("PDT value is :"+l); // primitive datatype
        System.out.println("WCO value is :"+lval);

        Integer ival2=Integer.valueOf("500");
        System.out.println("Integer WCO value is "+ ival2);

        Character cval=Character.valueOf('S');
        System.out.println("Character WCO Value is "+cval);
    }

    void method2(){

        Integer ival=new Integer(50);
        Byte bval=new Byte((byte) 100);
        Boolean boolval=new Boolean("shiv");

        System.out.println("Integer WCO is"+ ival);

        int x=ival.intValue();
        System.out.println(x);
    }

    public static void main(String[] args) {
        Prog4 obj=new Prog4();
        obj.method1();
        obj.method2();
    }
}
