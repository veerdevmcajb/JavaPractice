package string;

public class StringBuffBuildMethods {

    // append , length() , capacity, equal(), charAt(), setCharAt() , delete(int begin, int end), deleteCharAt(index), reverse()

    void meth1(){
        String s1=new String("java");
        StringBuffer sbuff=new StringBuffer("javascript");
        StringBuilder sbuild=new StringBuilder("sql");
        System.out.println(sbuild.reverse());

        System.out.println("-----concat()-----append()-------");
        s1.concat(" is awesome");
        System.out.println(s1);

        sbuff.append(" ia Awesome");
        sbuild.append(" is database ");
        System.out.println("append : " + sbuff);
        System.out.println("append : " + sbuild);

        System.out.println("-----equal()----");
        String s2=new String("java");
        StringBuffer sbuff2=new StringBuffer("javascript is Awesome");
        StringBuilder sbuild2=new StringBuilder("sql is database");

        // string equal check --> content
        // StringBuffer & Builder equal check --> Address / reference
        System.out.println("String equal :" + s1.equals(s2));
        System.out.println("StringBuffer equal :" + sbuff.equals(sbuff2));
        System.out.println("StringBuffer equal :" + sbuild.equals(sbuild2));

        System.out.println("-----capacity----length()-------");
        System.out.println("StringBuffer capacity is : " + sbuff.capacity());
        System.out.println("StringBuilder capacity is : " + sbuild.capacity());
        System.out.println("StringBuilder capacity is : " + sbuild.capacity());

        StringBuilder sb=new StringBuilder("");
        System.out.println(sb.capacity()); // default capacity is 16

        System.out.println("length of subiff "+ sbuff.length());
        System.out.println("length of subild "+ sbuild.length());

        System.out.println("---------reverse()-------charAt()");
        System.out.println("subiff chatAt(8)" + sbuff.charAt(8)); //p
       // System.out.println("reverse() " + sbuff.reverse());
       System.out.println(sbuild.reverse());


        System.out.println("----setCharAt()-----delete(int begin , int end )----deleteCharAt()------");
        System.out.println("Before set char : "+ sbuff);
         sbuff.setCharAt(12,'s');
        System.out.println("After set charAt(12) : " + sbuff); //javascript is Awesome
        System.out.println("after delete : " + sbuff.delete(11,13));    //javascript  Awesome
        System.out.println("after deleteCharAt() : " + sbuff.deleteCharAt(12)); //javascript  wesome


    }

    public static void main(String[] args) {
        StringBuffBuildMethods obj=new StringBuffBuildMethods();
        obj.meth1();
    }
}
