package collections.set.Hashset;

import java.util.HashSet;

public class ClassB {
    public static void main(String[] args) {
     HashSet <Integer>hs = new HashSet<Integer>();
     hs.add(20);
     hs.add(50);
     hs.add(30);
     hs.add(40);
     hs.add(10);   // insertion order is not maintained.
     hs.add(10);   // duplicates are not allowed
     hs.add(null); // allowed
     hs.add(50);

        System.out.println(hs);
    }
}
