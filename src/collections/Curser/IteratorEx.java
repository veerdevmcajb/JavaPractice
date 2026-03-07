package collections.Curser;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx {

    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(20);
        list.add(10);
        list.add(20);
        list.add(null);
        list.add(40);
        list.add(30);

        System.out.println(list);

     Iterator itr = list.iterator();
     while(itr.hasNext()){
         System.out.println(itr.next());
     }
    }
}
