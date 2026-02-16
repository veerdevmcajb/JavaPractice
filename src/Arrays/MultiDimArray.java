package Arrays;

import java.util.Arrays;

public class MultiDimArray {
    public static void main(String []args){

        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }

        int arr2[]={10,30,50,30,};
        Arrays.sort(arr2);
        System.out.println(arr[3]);
    }
}


//1 2 3
//4 5 6
//7 8 9

