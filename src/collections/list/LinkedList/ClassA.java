package collections.list.LinkedList;

import java.util.LinkedList;
import java.util.ListIterator;

/*  - In LinkedList data/obj is stored in the form of Nodes.
    - Each node is stored the address of privious & nextNode with object .
    - duplicates & null are allowed.
    - insertion order is maintained.
    - default capicity is 0
    - It is not synchronized.
* */

public class ClassA {

    void meth1(){

        System.out.println("implementing LinkedList ");
        LinkedList l=new LinkedList();
        l.add(10);
        l.add("Java");
        l.add(null);
        l.add(null);
        l.add(95);
        l.add(85);
        l.add(10);
        l.add(45);
        l.add(01);
        System.out.println("LinkedList : "+ l);

        System.out.println("-------ListIterator--------");
        ListIterator li=l.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }

        System.out.println("reverse order");
        System.out.println("----------ListIterator hasPrevious ---------- ");
        while (li.hasPrevious()){
            System.out.println(li.previous());
        }
        System.out.println();
        System.out.println("getFirst() "+ l.getFirst());
        System.out.println("getLast() " + l.getLast());
        System.out.println("removeFirst() " + l.removeFirst());
        System.out.println("removeLast() " + l.removeLast());

        System.out.println(l);
        l.addFirst(101);
        l.addLast(201);
        System.out.println("After adding first & last Elements " + l);
    }

    public static void main(String[] args) {
        ClassA obj=new ClassA();
        obj.meth1();
    }
}
