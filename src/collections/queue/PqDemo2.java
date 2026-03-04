package collections.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PqDemo2 {

    public static void main(String[] args) {

        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(50);
        pq.add(30);

        System.out.println(pq);

        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }

        // if we want to find the largest element

        while (!pq.isEmpty()){
            System.out.println(pq.poll());
            break;
        }
    }
}
