package collections.set.Hashset;

import java.util.HashSet;
import java.util.Iterator;
 /* - Hashset is available from 1.2
    - Insertion order is not maintained
    - duplicates are not allowed
    - null is allowed.
    - default capacity is 16
    - load factor :0.75 --> means you can add 12 elements in Hashset
        if you are adding one more elements the size will be increase by double . means size is 32.
    - Heterogeneous data is allowed.
    - It is not synchronized by default.
 * */

public class ClassA {

    void meth1(){
       HashSet hs=new HashSet();
       hs.add(10);
       hs.add("Java");
       hs.add(null);
       hs.add(40);
       hs.add("shiv");
       hs.add(60);
       hs.add(70);
       hs.add(80);
       hs.add(10);
       hs.add(null);
       hs.add(110);
        System.out.println("Hashset : "+ hs);
        Iterator i=hs.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }

    public static void main(String[] args) {
     ClassA obj = new ClassA();
        obj.meth1();
    }
}
