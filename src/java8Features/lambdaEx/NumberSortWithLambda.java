package java8Features.lambdaEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// sorting the numbers with lambda

public class NumberSortWithLambda {

    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(50, 20, 40, 10, 30));

        System.out.println("Before Sorting "+al);

        // it will sort The ArrayList in Ascending Order
        Collections.sort(al,(i,j)->i.compareTo(j));
        System.out.println(al);

        // It will sort The Arraylist in Descending order.
        Collections.sort(al,(i,j)->(i>j) ? -1 : 1);
        System.out.println(al);
    }
}
