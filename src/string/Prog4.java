package string;

public class Prog4 {
    public static void main(String[] args) {
        String name="SHiv";
        String rev="";
        for(int i=0;i<=name.length()-1;i++){
            char ch=name.charAt(i);
            if(Character.isUpperCase(ch)){
                rev+=Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                rev+=Character.toUpperCase(ch);
            }
        }
        System.out.println(rev); // shIV
    }
}
