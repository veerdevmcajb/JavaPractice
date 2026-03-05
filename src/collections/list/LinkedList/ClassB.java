package collections.list.LinkedList;

// Q. Add Elements at Beginning and End

import java.util.LinkedList;
import java.util.List;

public class ClassB {
    public static void main(String[] args) {

        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(10);
        ll.add(20);

        System.out.println(ll);

        ll.addFirst(30); // adding element at 1st position
        ll.addLast(50); // adding element at last position
        System.out.println("After Adding first & lst "+ ll);

        ll.add(3,40);
        System.out.println(ll); // we can add a element at any specific position

        ll.removeFirst();
        ll.removeLast();
        System.out.println("after removing first & lst element : "+ll);
    }
}
