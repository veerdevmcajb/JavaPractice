package Arrays;

import java.util.Scanner;

public class VowelsInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Size of Array");
        int size=sc.nextInt();

        char charArr[]=new char[size];
        System.out.println("Enter a characters inside the array");
        for(int i=0;i<charArr.length;i++){
            charArr[i]=sc.next().charAt(0);
        }

        int count=0;
        for(int i=0;i<size;i++){
            if(charArr[i]>='a' && charArr[i]<='z' || charArr[i]>='A' && charArr[i]<='Z'){
                switch (charArr[i]){
                    case 'a':
                    case 'A':
                    case 'e':
                    case 'E':
                    case 'i':
                    case 'I':
                    case 'o':
                    case 'O':
                    case 'u':
                    case 'U':
                        count++;
                }
            }
        }

        System.out.println("The num of Vowels are : "+count);

        System.out.println("---------Reverse a array--------");
        for(int i=charArr.length-1;i>=0;i--){
            System.out.println(charArr[i]);
        }
    }
}
