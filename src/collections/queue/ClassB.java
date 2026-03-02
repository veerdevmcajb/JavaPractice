package collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class ClassB {
    public static void main(String[] args) {
        Queue queue=new PriorityQueue();
        queue.add(10);
        queue.offer(8);
        queue.add(12);
        queue.offer(18);
        queue.add(100);

        System.out.println(queue);
    }
}
