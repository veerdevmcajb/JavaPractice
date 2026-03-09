package collections.map.HashMap;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        HashMap<Integer, String> hm=new HashMap<>();
        hm.put(101,"Veer");
        hm.put(102,"Rutvik");
        hm.put(103,"Bashu");
        hm.put(104,"Akash");
        hm.put(102,"Raj"); // key can't be duplicate , duplicate key-> value is override
        hm.put(103,"Bablu");



        System.out.println(hm);

        System.out.println(hm.get(10)); // null

        Set set = hm.entrySet(); // pair of key-value is called Entry
        System.out.println(set);

        Set set1 = hm.keySet();
        System.out.println(set1); //[101, 102, 103, 104]

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry entry =(Map.Entry) iterator.next();
            System.out.println(entry.getKey() +" --> " + entry.getValue());
        }

        // keyset()
        for(Integer s:hm.keySet()){
            System.out.println(s + " "+ hm.get(s));
        }

        //entryset()
        for(Map.Entry entry: hm.entrySet()){
            System.out.println(entry.getKey() + "--" + entry.getValue());
        }

        //foreach()
        System.out.println("---------------using foreach() method --------------------");
        hm.forEach((k,v)-> System.out.println(k +" "+ v));
    }
}
