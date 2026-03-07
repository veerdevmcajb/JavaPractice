package collections.Curser;

import java.util.Enumeration;
import java.util.Vector;

// - Vector insertion order maintained.
// - Duplicated are allowed
// - Null is allowed.


public class EnumerationEx {
    public static void main(String[] args) {

        Vector v=new Vector();
        v.add(10);
        v.add(30);
        v.add(30);
        v.add(20);
        v.add(40);
        v.add(50);
        v.add(null);

        System.out.println(v);

        System.out.println("---- Using Enumeration ----");

        Enumeration e=v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
