package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
      int arr[]={2,3,1,5,6,7};

      int arr2=arr[0];
      arr[0]=arr[4];
      arr[4]=arr[arr2];
        System.out.println(Arrays.toString(arr));
    }
}
