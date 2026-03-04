package collections.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class KSmallestElements {

    public static void main(String[] args) {

        int arr[]={10,4,3,50,23,90};
        int k=3;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:arr){
            pq.add(num);
            if(pq.size() > k){
                pq.remove(); // remove largest
            }
        }
        System.out.println(pq);
    }
}
