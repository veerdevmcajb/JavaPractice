package Arrays;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {
        int arr[]={10,60,20,80,30,70,40,50};
        System.out.println(arr); // [I@65ab7765

        System.out.println(Arrays.toString(arr)); //[10, 60, 20, 80, 30, 70, 40, 50]

        Arrays.sort(arr); // sorting the array in ascending Order.
        System.out.println(Arrays.toString(arr));

        int key=50;
        System.out.println(Arrays.binarySearch(arr,key)); // we can search our element & return a index using binarySearch()

        Arrays.parallelPrefix(arr,(x,y)->(x+y));
        System.out.println(Arrays.toString(arr));

        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,3,4,5};
        System.out.println(Arrays.compare(arr1,arr2)); // compare() returns 0 if arrays are equlas.

        System.out.println(Arrays.equals(arr1,arr2)); // equals () return true or false

        String fruits[]={"Banana","Apple","Orange","Mango"};
        System.out.println(Arrays.toString(fruits));

        Arrays.fill(fruits,"KIWI"); // fill() fill the array with a specified value.

        System.out.println(Arrays.toString(fruits));
    }
}
