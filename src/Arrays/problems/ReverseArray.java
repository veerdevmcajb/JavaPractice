package Arrays.problems;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={10,20,40,70,30,50,80};

        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Reverse Array");

        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
