package collections.map.HashMap;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        HashMap hm=new HashMap();
        hm.put(101,"Veer");
        hm.put(102,"Rutvik");
        hm.put(103,"Bashu");


        System.out.println(hm);

        Set set = hm.entrySet();
        System.out.println(set);

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry entry =(Map.Entry) iterator.next();
            System.out.println(entry.getKey() +" --> " + entry.getValue());
        }
    }
}
