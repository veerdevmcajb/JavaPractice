package collections.set.LinkedHashSet;

import java.util.LinkedHashSet;

public class ClassB {
    public static void main(String[] args) {
       LinkedHashSet <Integer>lhs=new LinkedHashSet<>();
       lhs.add(50);  // insertion order is maintained.
       lhs.add(10);
       lhs.add(20);
       lhs.add(10); // duplicates are not allowed
       lhs.add(30);
       lhs.add(60);
       lhs.add(null); // null is allowed
       lhs.add(90);
       lhs.add(null);
        System.out.println(lhs);
    }
}
