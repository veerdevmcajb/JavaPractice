package collections.map.HashTable;

import java.util.Hashtable;
/*  - Insertion order is not maintained.
    - Duplicates keys are not allowed
    - null keys and null values are not allowed
    - Heterogeneous keys are allowed and  Heterogeneous values are allowed.
    - It is available from java 1.0v
    - Default capacity 16 .
    - Load factor 0.75 .
    - It is Synchronized (Legend Classes --> Vector & HashTable )
* */

public class ClassA {

    void meth1(){
        System.out.println("Implementing HashTable");
       Hashtable hasht=new Hashtable();
        hasht.put(101,"java");
        hasht.put(102,"Python");
       // hasht.put(null,null);
        hasht.put(104,"java");
       // hasht.put(106,null);
        hasht.put(103,5000);
        hasht.put(105,"HTML");
        hasht.put("java",2000); // Heterogeneous keys are allowed
        System.out.println(hasht);
        hasht.put(103,3000);
        System.out.println(hasht);

    }

    public static void main(String[] args) {
        ClassA obj=new ClassA();
        obj.meth1();
    }
}
