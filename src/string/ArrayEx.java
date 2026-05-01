package string;

public class ArrayEx {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5};

        //1. Reverse an Array
        int revArray[];
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

        int min=arr[0];
        int max=arr[0];

        for(int num : arr){
            if(num>max)
                max=num;

            if(num <= min){
                min=num;

            }
        }
        System.out.println("max is "+ max);
        System.out.println("Min is "+min);

    }
}
