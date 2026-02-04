package collections.list.arraylist;

import java.util.ArrayList;
/*  Fail fast Collection throw error immedietly when we try to modify the collection object
    while traversiong the collections.
    ex. ArrayList, LinkedList,vector,HashSet,LinkedHashSet,etc..

    Fail Safe Collection will not throw any error even if we are modifying the obj while traversing .
    ex. CopyOnWriteArrayList, ConcurrentHashMap
* */

public class FailFastException {
    public static void main(String[] args) {
        ArrayList <Integer>al=new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);

        System.out.println(al);

        for(int i:al){
            System.out.println(i);
            if(i==100){
                al.add(500); // ConcurrentModificationException
            }
        }
    }
}
