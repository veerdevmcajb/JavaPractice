package string;

public class CountChar {
    public static void main(String[] args) {
        String str="Shivanand";
        int count=0;
        System.out.println(str.length());
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o'|| str.charAt(i)=='u'){
                System.out.println("Vowels count "+ count);
                count++;
            }
        }
    }
}
