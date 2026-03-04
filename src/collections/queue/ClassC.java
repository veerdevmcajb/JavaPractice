package collections.queue;

import java.util.PriorityQueue;

public class ClassC {
    public static void main(String[] args) {

        PriorityQueue<Integer>pq=new PriorityQueue<>();
        pq.add(50);
        pq.add(10);
        pq.add(40);
        pq.add(20);
        pq.add(30);
        System.out.println(pq);  // before removing the elements it is not sorted.
        pq.remove(10);
        System.out.println(pq); // after removing the elements . it is following the sorting order.


    }
}
