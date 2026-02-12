package string;

public class StringMethods {

    void meth1(){
        // == , .equal , length(), charAt(), concat(), startsWith(), toLowerCase(),
        // toUpperCase(), equlsIgnoreCase(), subString(), replace(), trim(),
        // indexOf(), lastIndexOf(),

        System.out.println("String methods");
        String s1="Java";
        String s2=new String("Java");
        String s3="Java";
        String s4=new String("Java");



        System.out.println(s1.equals(s2));  // true
        System.out.println("Java".equals("Java"));  //true
        System.out.println(s1.equals("java"));  //false
        System.out.println("euqalIgnoreCase "+ s1.equalsIgnoreCase("java"));
        System.out.println("-----------------------------");
        System.out.println(s1==s2); // false
        System.out.println(s1==s3); // true
        System.out.println(s3==s4); //false
        System.out.println(s1=="Java"); // true

        System.out.println("--------concat------------");
        System.out.println(s1.concat(s2));
        System.out.println(s1.concat(" is Awesome"));
        System.out.println(s1.concat(" is Awesome").length());

        System.out.println("---------length-------------");
        System.out.println("length of s1 is : "+s1.length());

        System.out.println();
        System.out.println("----length()------charAt()----startsWith()-------");

        String s5="Shivanand";
        System.out.println("s5 length is "+s5.length());
        System.out.println("charAt 4 is "+ s5.charAt(4));
        System.out.println("s5 Starts with a "+s5.startsWith("a"));
        System.out.println("s5 Starts with S "+s5.startsWith("S"));

        System.out.println();
        System.out.println("---------toLowerCase()-----toUpperCase()------indexOf()------lastIndexOf()------");
        System.out.println("toLowercase "+s5.toLowerCase());
        System.out.println("toUpperCase "+s5.toUpperCase());
        System.out.println("indexOf 5 in s5 is :"+ s5.indexOf('a'));
        System.out.println("lastIndexOf s5 is : "+ s5.lastIndexOf('a'));

        System.out.println();
        System.out.println("----substring()-----replace()------trim()------");
        System.out.println("substring of s1 form 0 to 4 : "+s5.substring(0,4));
        System.out.println(s5.replace('a','o'));

        String s6="    Shivanand Chandankar       ";
        System.out.println("s6 Before trim : "+s6);
        System.out.println("s6 After trim : "+s6.trim());

        String s7="java is awesome";
        System.out.println(s7.contains("is"));
        System.out.println(s7.substring(5,8));

        //toString()
        Integer num=10;
        System.out.println(num.toString());
        String s8=String.valueOf(num);
        System.out.println(s8.length());

        System.out.println("----------");
        String str="Natha";
        String rev;
        char [] ch= str.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i]);
        }
    }

    public static void main(String[] args) {
        StringMethods obj=new StringMethods();
        obj.meth1();

        String s="name";
        int r=Integer.parseInt(s);// String to int
        String s1=String.valueOf(r); // int to String


    }
}
