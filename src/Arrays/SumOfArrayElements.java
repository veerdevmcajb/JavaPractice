package Arrays;

public class SumOfArrayElements {

    public static void sum(int [] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of Array Elements is : "+ sum);
    }

    public static int [] m1(){
        // returning the Array.
        return new int[]{10,20,30,40,50};
    }

    public static void main(String[] args) {
        int []arr={3,1,2,5,4,6};
        sum(arr); // we can pass our array to the method.

        System.out.println( "returning The Array from the methods.");
        // returning The Array from the methods.
        int returnArr[]=m1();
        for(int i=0;i<returnArr.length;i++){
            System.out.println(returnArr[i]+" ");

        }
    }
}
