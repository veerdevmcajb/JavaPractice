package collections.Curser;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {

        LinkedList ll=new LinkedList();
        ll.add("veer");
        ll.add(90);
        ll.add(10);
        ll.add(30);
        ll.add(10);
        ll.add(null);
        ll.add(20);

        System.out.println(ll);

        ListIterator itr = ll.listIterator();

        // forward direction
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        // backward direction
        while (itr.hasPrevious()){
            System.out.println(itr.previous());
        }



    }
}
