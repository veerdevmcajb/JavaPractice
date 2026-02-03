package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionSort {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        al.add(10);
        al.add(30);
        al.add(50);
        al.add(20);
        al.add(40);
        System.out.println("Before sort "+al);
        Collections.sort(al);
        System.out.println("After sort "+ al);
        Collections.reverse(al);
        System.out.println("Reverse "+ al);
    }
}
