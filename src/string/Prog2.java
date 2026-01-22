package string;

public class Prog2 {
    public static void main(String[] args) {
       // int num=1234;
       // int rev=0,rem;
//        while(num>0){
//            rem=num%10;
//            rev=rev*10+rem;
//            num=num/10;
//        }
       // System.out.println(rev);

        String str="natha is great";
        String[] arr = str.split(" ");
        //String str=Integer.toString(num);
        System.out.println(arr);
        for(String i : arr){
            System.out.println(i);
        }
      //  System.out.println(str instanceof String);
//
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i] + " m");
        }

    }
}
