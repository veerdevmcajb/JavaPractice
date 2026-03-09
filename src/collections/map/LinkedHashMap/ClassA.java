package collections.map.LinkedHashMap;

import collections.list.arraylist.ArraListEx6;

import java.util.*;

// insertion order in maintained
// Duplicate key is not allow  but duplicate value is allowed
public class ClassA {
    public static void main(String[] args) {

        LinkedHashMap map=new LinkedHashMap();
        map.put(1,"Shiv");
        map.put(2,"veer");
        map.put(3,"Natha");
        map.put(4,"Shiv");
        map.put(1,"Shiv");
        map.put(1,"Shiv");

        System.out.println(map);
        System.out.println(map.entrySet());

        Set set = map.entrySet();
        System.out.println(set);

        map.keySet();

       List list =new ArrayList(map.keySet());
        System.out.println(list);

        System.out.println(map.getOrDefault(5,"Default value"));

        System.out.println(map.containsKey(2));
    }
}
