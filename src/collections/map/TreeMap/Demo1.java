package collections.map.TreeMap;

import java.util.TreeMap;

public class Demo1 {
    public static void main(String[] args) {
        TreeMap map=new TreeMap();
        map.put(101,"Shiv");
        map.put(105,"Veer");
        map.put(107,"Natha");
        map.put(102,"Akash");
        map.put(103,"Bablu");
        map.put(104,"Abhi");

        System.out.println(map);

        System.out.println(map.ceilingEntry(106));  //107=Natha

        System.out.println(map.ceilingKey(107));    //107

        System.out.println(map.floorEntry(106));    //105=Veer

        System.out.println(map.containsKey(106)); // false

        System.out.println(map.firstEntry()); //101=Shiv

        System.out.println(map.lastEntry());    //107=Natha

        System.out.println(map.get(101));   //Shiv

        TreeMap m=new TreeMap();

    }
}
