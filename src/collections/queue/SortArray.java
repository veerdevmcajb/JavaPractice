package collections.queue;

import java.util.PriorityQueue;

// Q . Sort Array Using PriorityQueue

public class SortArray {

    public static void main(String[] args) {

        int arr[]= {5, 2, 8, 1, 3};

        PriorityQueue<Integer> pq = new PriorityQueue();

        // Adding arr elements into priorityQueue .
        for(int num : arr){
            pq.add(num);
        }

        // removing elements
        while (!pq.isEmpty()){
            System.out.print(pq.poll() +" ");
        }
    }
}
