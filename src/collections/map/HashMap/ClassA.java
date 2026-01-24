package collections.map.HashMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/*  - Insertion order is not maintained.
    - Duplicates keys are not allowed but values can be duplicates.
    - Heterogeneous keys are allowed.
    - Heterogeneous values are allowed.
    - Null keys and null value is allowed.
    - HashMap is available from java 1.2v
    - Default capacity is 16.
    - Load Factor is 0.75
    - It is Not synchronized.
*
* */

public class ClassA {

    void meth1(){
        HashMap hm= new HashMap();
        hm.put(101,"Java");
        hm.put(102,"sql");
        hm.put("Java",500);
        hm.put(103,"Python");
        hm.put(104,"Java");
        hm.put(null,null);
        hm.put(105,555);
        System.out.println(hm);
        hm.put(105,111);
        System.out.println(hm);

        //retriving the data from map Implementation classes
        HashSet hs1=new HashSet(hm.keySet());
        System.out.println(hs1); // it will retrive the all keys
        System.out.println("-------------------");
        HashSet hs2=new HashSet(hm.entrySet());
        System.out.println(hs2);

        Iterator i=hs2.iterator();
        while (i.hasNext()){
            //System.out.println(i.next());
            Map.Entry e=(Map.Entry) i.next();
            System.out.println(e.getKey() + " "+ e.getValue());
        }
    }

    public static void main(String[] args) {
        ClassA obj=new ClassA();
        obj.meth1();
    }
}
