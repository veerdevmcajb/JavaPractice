package string;

public class NumOfVowels {
    public static void main(String[] args) {
        String str="Shivanand";
     int a=0,e=0,i=0,o=0,u=0;
     int totalVowel=0;

     for(int j=0;j<str.length();j++){
         char ch=str.charAt(j);
         if(ch=='a'){
             a++;
             totalVowel++;
             System.out.println(ch +" "+a);
         }
         else if(ch=='e'){
             e++;
             totalVowel++;
             System.out.println(ch+" "+e);
         }
         else if(ch=='i'){
             i++;
             totalVowel++;
             System.out.println(ch+" "+i);
         }
         else if(ch=='o'){
             o++;
             totalVowel++;
             System.out.println(ch+" "+o);
         }
         else if(ch=='u'){
             u++;
             totalVowel++;
             System.out.println(ch+" "+u);
         }
     }
        System.out.println(totalVowel);
    }
}
