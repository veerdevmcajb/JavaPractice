package string;

public class StringDemo {

    public static void main(String[] args) {
        for(int i=2;i<=15;i++){
            if(i%2==0  || i%5==0 || i%7==0){
                System.out.print(i+" ,");
            }
        }

        String s1="Atul";
        String s5="Atul";
        System.out.println("s1==s5"+(s1==s5));
//        String s2=new String("Atul");
//        boolean result=s1==s2;
//        boolean res2=s1.equals(s2);
//
//        switch(result){
//
//        }
    }
}
