package java8Features;

import java.util.ArrayList;
import java.util.Collections;

public class ForEachMethodEx {

    public static void main(String[] args) {

        ArrayList<Integer> al= new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(50);
        al.add(90);
        al.add(30);
        al.add(40);
        al.add(60);

        System.out.println(al);

        System.out.println("==================Using for loop====================");
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }

        System.out.println("===========using for-each ======================");
        for(int x:al){
            System.out.println(x);
        }

        System.out.println("==========using forEach() method==========");
        al.forEach(i-> System.out.println(i));
        // forEach() introduced in 1.8 v

        // sorting the data
        Collections.sort(al);
        System.out.println("After sorting "+al);

        Collections.sort(al,(i,j)->(i>j) ? -1 : 1);
        System.out.println("Sorting in Descending order "+al);

    }
}
