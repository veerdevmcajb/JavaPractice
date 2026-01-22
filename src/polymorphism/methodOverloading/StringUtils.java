package polymorphism.methodOverloading;

public class StringUtils {

    public String concatenites(String str1,String str2){
        return str1+str2;
    }

    public String concatenites(String str1,String str2,String str3){
        return str1 + str2 + str3;
    }

    public static void main(String[] args) {
        StringUtils obj=new StringUtils();
        String res = obj.concatenites("Shiv ","Chandankar");
        System.out.println(res);
        System.out.println(obj.concatenites("Shiv ","Veer ","Ram"));
    }
}
