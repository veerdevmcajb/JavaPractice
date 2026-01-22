package collections.list.arraylist;

import java.util.ArrayList;

public class ArrayListEx5 {
    public static void main(String[] args) {

        // Adding one collection into another collection

        ArrayList<String> a1=new ArrayList<String>();
        a1.add("Natha");
        a1.add("Anu");
        a1.add("Ram");

        ArrayList<String>a2=new ArrayList<String>(a1);
        a2.add("Vijay");
        a2.add("Akash");
        a2.add("Nilesh");
        System.out.println(a2);

        //AddAll() approach : Adding many collections into another collections : many to one

        ArrayList <Integer> obj1=new ArrayList<Integer>();
        obj1.add(10);
        obj1.add(20);
        obj1.add(30);

        ArrayList<Integer> obj2=new ArrayList<Integer>();
        obj2.add(40);
        obj2.add(50);
        obj2.add(60);

        ArrayList<Integer>obj3=new ArrayList<Integer>();
        obj3.addAll(obj1);
        obj3.addAll(obj2);
        obj3.add(100);
        System.out.println(obj3);
    }
}

//add() :-> used to add only one object.
// addAll() :-> used to add collection data.
