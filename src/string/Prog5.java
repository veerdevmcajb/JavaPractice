package string;

import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.next();
        String rev = new StringBuilder(s).reverse().toString();

        if(s.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

        vowels();
        duplicates();
        revWord();
    }

    static void vowels(){
        String str="hello world";
        int vowels=0, constant=0;

        for(char c:str.toLowerCase().toCharArray()){
            if(c >='a' && c<='z'){
                if("aeiou".indexOf(c)!=-1){
                    vowels++;
                }else{
                    constant ++;
                }
            }
        }
        System.out.println("Vowels" + vowels);
        System.out.println("Constant "+ constant);
    }

    static void duplicates(){
        String s2="shivanand";
        String res="";
        for(int i=0;i<s2.length();i++){
            if(res.indexOf(s2.charAt(i))==-1){
                res = res+ s2.charAt(i);
            }
        }
        System.out.println(res);
    }

    //8. Reverse Words in a Sentence
     static void revWord(){
        String str="java is fun";
        String []words=str.split(" ");

        for(int i=words.length-1; i>=0;i--){
            System.out.print(words[i] + " ");
        }
     }
}

