package java8Features.lambdaEx;

import java.util.*;

//Approach 1 Without using Lambda

public class NumbersSort {

    public static void main(String[] args) {

        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(50,20,40,10,30));
        System.out.println("Before sorting "+al);
        Collections.sort(al, new NumberComparater());
        System.out.println("After Sorting "+ al);

        // with the use of Lambda

        Collections.sort(al,(i,j)->i.compareTo(j));
        System.out.println(al); // it will sorting in the Ascending order.

        Collections.sort(al,(i,j)->(i>j) ? -1 : 1);
        System.out.println(al); // it will Sorting in the Descending order.
    }
}

class NumberComparater implements Comparator<Integer>{

    @Override
    public int compare(Integer i, Integer j) {
        if(i>j){
            return -1;
        } else if (i<j) {
            return 1;
        }
        return 0;
    }
}
