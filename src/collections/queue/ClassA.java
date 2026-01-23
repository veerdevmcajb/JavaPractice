package collections.queue;

import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
/* - in prority queue always the first element will be smaller element
   - Insertion order is not maintained.
   - It allowes only Homogeneous data
   - Duplicates are allowed.
   - Null is not allowed.
   - default capacity is 11.
   - It is available from java 1.5v.
   - It is Not synchronized.
*
* */
public class ClassA {

    void meth1(){
        // Queue Interface : offer() ==> It will add the elements into collection class.
        // List Interface add() ==> It will add the elements into collection class.
        // form java 1.7v onwards LinkedList implements both List & Queue properties.

        List l1=new LinkedList();
        l1.add(45);
        // l1.offer(55); //C.E

        LinkedList l2=new LinkedList();
        l2.add(88);
        l2.offer(99);
    }

    void meth2(){
        PriorityQueue pq=new PriorityQueue();
        pq.add(45);
        pq.add(56);
       // pq.offer("java");
       // pq.offer(null);
        pq.add(41);
        pq.add(5);
        pq.add(1);
        pq.add(56);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq);
        pq.clear();
        System.out.println(pq);
        System.out.println(pq.poll()); //null
       // System.out.println(pq.remove()); // NoSuchElementsException

    }

    public static void main(String[] args) {
       ClassA obj=new ClassA();
            obj.meth1();
            obj.meth2();
    }
}
