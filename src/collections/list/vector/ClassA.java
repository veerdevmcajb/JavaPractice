package collections.list.vector;

import java.util.Enumeration;
import java.util.Vector;
/*  Vector is a pre-define class in java.util package.
    It is a legacy class from java 1.o .
    Initial capicity is 10. Increment capicity is (current capicity * 2).
    Insertion order is maintained.
    null is allowed , duplicates are allowed.
    vector is Thread safe and synchronzed.

    Enumeration Interface is used for legacy classes.
    - Enumeration have two methods -> 1) hasMorElements() . 2) nextElement() .

    Note: we we want to avoid the yellow lines then use Generics
* */

public class ClassA {

    void meth1(){
        System.out.println("Vector Implementing...");
        Vector v=new Vector();
        v.add(10);
        v.add("Java");
        v.add(null); // null is allowed
        v.add(85);
        v.add(1);
        v.add(84);
        v.add(96);
        v.add(10); // duplicates are allowed
        v.add(50);
        System.out.println("Vecter : "+ v);
        System.out.println("-----------------------------");
        for(int i=0;i<v.size();i++){
            System.out.println(v.get(i));
        }

        System.out.println("-------for-each loop------------");
        for(Object o :v){
            System.out.println(o);
        }

        System.out.println("-------------Enumeration Iterator----");
        Enumeration e=v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        v.addElement(500);
        System.out.println(v);
        v.removeElement(10); // remove first Occurence
        System.out.println(v);
        System.out.println(v.lastElement());
        System.out.println(v.firstElement());
    }

    public static void main(String[] args) {
        ClassA obj=new ClassA();
        obj.meth1();
    }
}
