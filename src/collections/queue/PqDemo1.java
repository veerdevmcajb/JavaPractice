package collections.queue;

import java.util.*;

public class PqDemo1 {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue();
        pq.add(30);
        pq.add(10);
        pq.add(20);

        // copy the queue.
        PriorityQueue<Integer> copy = new PriorityQueue<>(pq);

        System.out.println(pq); // [10, 30, 20]

        // after this operation the queue will be empty so we have to copy the queue.
        while (!copy.isEmpty()){
            System.out.println(copy.poll());
        }

        System.out.println(copy); //[]

        // Convert to sorted list

        List<Integer> list=new ArrayList<>(pq);
        System.out.println("List is : "+list);
        Collections.sort(list);
        System.out.println(list);

        System.out.println(pq);
    }
}
