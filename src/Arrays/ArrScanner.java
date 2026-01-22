package Arrays;

import java.util.Scanner;

public class ArrScanner {

    void meth1(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a size of array");
       int length=sc.nextInt();
       int arr[]=new int[length];
       // int arr[]=new int[sc.nextInt()]; // VALID
        System.out.println("Length of arr : "+ arr.length);

        System.out.println("plz enter "+ arr.length+" elements");
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Data Entered");
        System.out.println("___________________");

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("-------get the value form 4 to 1--------------");
        for(int i=arr.length-2;i>=1;i--){
            System.out.println(arr[i]);
        }
        System.out.println("_____for-each___________");
        for(int x:arr){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        ArrScanner obj=new ArrScanner();
        obj.meth1();
    }
}
