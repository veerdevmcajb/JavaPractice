package string;

public class Prog3 {
    public static void main(String[] args) {
        String name="Shivanand";
        int count=0;
        name=name.toLowerCase();

        for(int i=0;i<name.length()-1;i++){
            char ch=name.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){

            count ++;
            }

        }
            System.out.println("count is "+count);
    }
}
