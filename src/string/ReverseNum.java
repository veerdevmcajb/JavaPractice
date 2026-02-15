package string;

public class ReverseNum {
    public static void main(String[] args) {
        int num=123456789;
        int rev=0;
        while(num>0){
            int rem=num%10;
             rev=rem;
            num=num/10;
        System.out.print(rev);
        }
    }
}
