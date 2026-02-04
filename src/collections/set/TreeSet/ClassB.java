package collections.set.TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class ClassB {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(90);
        ts.add(10);
        ts.add(40);
        ts.add(70);
        ts.add(50);
        ts.add(10); // duplicated are not allowed.
      //  ts.add(null); // null is not allowed.
        System.out.println(ts);

        Iterator i1=ts.iterator();
        while (i1.hasNext()){
            System.out.println(i1.next());
        }

        System.out.println("descendingIterator");
        Iterator i2=ts.descendingIterator();
        while (i2.hasNext()){
            System.out.println(i2.next());
        }

        System.out.println(ts.tailSet(70));
        System.out.println(ts.headSet(50));

    }
}
