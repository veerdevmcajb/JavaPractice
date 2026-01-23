package collections.set.LinkedHashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

// There is only one diff between Hashset and LinkedHashSet is
// LinkedHasSet is allowed insertion order.
// Hashset does not allowed insertion order.

public class ClassA {
    void meth1(){
        System.out.println("LinkedHashSet");
        LinkedHashSet lhs=new LinkedHashSet();
        lhs.add(10);
        lhs.add("Java");
        lhs.add(null);
        lhs.add(40);
        lhs.add("shiv");
        lhs.add(60);
        lhs.add(70);
        lhs.add(80);
        lhs.add(10);
        lhs.add(null);
        lhs.add(110);
        System.out.println("Hashset : "+ lhs);
        Iterator i=lhs.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }

    public static void main(String[] args) {
        ClassA obj=new ClassA();
        obj.meth1();
    }
}
