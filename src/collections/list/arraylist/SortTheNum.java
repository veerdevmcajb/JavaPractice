package collections.list.arraylist;

import java.util.*;

public class SortTheNum {
    public static void main(String[] args) {
        ArrayList <Integer>al=new ArrayList<>(Arrays.asList(10,40,20,50,30,80,100,70,90));
        System.out.println(al);
        Collections.sort(al);
        System.out.println("After Sorting " + al);
        Collections.reverse(al);
        System.out.println("Reverse order "+al);
    }
}
