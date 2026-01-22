package string;

public class Prog1 {
    public static void main(String[] args) {
        //object class toString(): class-name@hashcode
        Prog1 p1=new Prog1();
        System.out.println(p1); //string.Prog1@65ab7765
        System.out.println(p1.toString());  //string.Prog1@65ab7765

        //string class toString() executes it return data
        String s="Shiv";
        System.out.println(s);  //Shiv
        System.out.println(s.toString());   //Shiv

        //StringBUffer class toString() executed it returns data
        StringBuffer sb=new StringBuffer("Veer");
        System.out.println(sb); //Veer
        System.out.println(sb.toString());  //Veer

        // all wrapper classes toString() return the data
        Integer i=new Integer(100);
        System.out.println(i);      //100
        System.out.println(i.toString());   //100

    }
}
