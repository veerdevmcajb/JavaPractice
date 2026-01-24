package collections.map.TreeMap;

import java.util.TreeMap;
/*  - Insertion order is not maintained. But Sorted by keys.
    - duplicates keys are not allowed. But Duplicate values are allowed.
    - Heterogenous keys are not allowed. But  Heterogenous values are allowed.
*   - NUll keys are not allowed But null values are allowed.
    - available from java 1.2v.
    - Default capacity is 16.
    - It is Not Synchronized.
* */

public class ClassA {

    void meth1(){
        System.out.println("Implementing TreeMap");
       TreeMap tm=new TreeMap();
       tm.put(101,"java");
       //tm.put("java",5000); // Heterogenous values are allowed.
       tm.put(101,"sql");   // duplicates keys are not allowed.
       //tm.put(null,null); // null keys are not allowed but null value is allowed
       tm.put(105,"java");
       tm.put(103,null);
       tm.put(104,"js");
       tm.put(104,null);
       tm.put(102,200);
        System.out.println(tm);
        tm.put(106,"js");
        System.out.println(tm);


    }

    public static void main(String[] args) {
       ClassA obj =new ClassA();
        obj.meth1();
    }
}
