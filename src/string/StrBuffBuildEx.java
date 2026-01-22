package string;

public class StrBuffBuildEx {

    void meth1(){

        StringBuffer sb=new StringBuffer();
        StringBuffer sb1=new StringBuffer("Shivanand");
        StringBuffer sb2=new StringBuffer(50);

        System.out.println(sb1);
        // append()
        System.out.println(sb1.append(" Chandankar"));

        // capicity
        System.out.println(sb.capacity());

        System.out.println(sb.append("12345678910123451"));
        System.out.println(sb.capacity());

        System.out.println("Shivanand");
    }

    public static void main(String[] args) {
        StrBuffBuildEx obj=new StrBuffBuildEx();
        obj.meth1();
    }
}
