package collections.set.TreeSet;

import com.sun.source.tree.Tree;

import java.util.Iterator;
import java.util.TreeSet;

/*  - Uses Balanced Birany Search tree algorithm.
    - Natural Sorting order.
    - Insertion order in not maintained (Sorting order - ascending order)
    - It will not allow Heterogeneous Data. (It will allow only Homogeneous data.)
    - Duplicated are not allowed.
    - Null is not allowed. -- it will give null pointer exception
    - Default capacity is 16 load factor is 0.75.
    - Treeset is available from java 1.2
    - It is not Synchronized.
* */

public class ClassA {
    void meth1(){

      TreeSet ts = new TreeSet();
     ts.add(75);
  //   ts.add(null); // it will not allowed null.
     ts.add(55);
     ts.add(25);
     ts.add(75);// duplicates are not allowed.
     ts.add(88);
     ts.add(99);
      //  ts.add("java"); // It will not allowed Heterogenious Data
        System.out.println("Treeset : "+ ts);

        System.out.println("Using Iterator");
        Iterator i=ts.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("----retriving the data in revere order using desendingIterator--- ");
        Iterator i2 = ts.descendingIterator();
        while (i2.hasNext()){
            System.out.println(i2.next());
        }
        System.out.println("----headset()-----");
        System.out.println(ts.headSet(75));
        System.out.println("-----tailSet()------");
        System.out.println(ts.tailSet(75));
    }

    public static void main(String[] args) {
      ClassA obj = new ClassA();
        obj.meth1();
    }
}
