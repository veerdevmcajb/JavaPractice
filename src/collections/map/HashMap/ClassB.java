package collections.map.HashMap;
import java.util.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ClassB {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(101,"Shiv");
        map.put(102,"veer");
        map.put(103,"Raj");
        map.put(101,"Shyam"); // duplicates are not allowed.
        System.out.println(map);

        map.put(104,"ram");
        System.out.println(map);
        System.out.println(map.get(102));
        System.out.println(map.size());
        System.out.println(map.isEmpty());

        // values
        Collection<String> values=map.values();
        for(String s:values){
            System.out.println(s);
        }

        // reterive  the keys
        Collection<Integer>keys=map.keySet();
        for(Integer i:keys){
            System.out.println(i);
        }


    }
}
