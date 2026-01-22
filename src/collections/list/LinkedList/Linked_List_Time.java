package collections.list.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linked_List_Time {

    private static Object arr[];
    static {
        arr=new Object[100000];
        for(int i=0;i<arr.length;i++){
            arr[i]=new Object();
        }
    }

    void arrayListTime()
    {
        long start,end;
        ArrayList al=new ArrayList();
        start=System.currentTimeMillis();
        for(Object obj1:al){
            al.add(obj1);
        }
        end=System.currentTimeMillis();
        System.out.println("ArrayList Construction time "+ (end-start));
    }

    void linkedListTime()
    {
        long start,end;
        LinkedList ll=new LinkedList();
        start=System.currentTimeMillis();
        for (Object obj2:ll){
            ll.add(obj2);
        }
        end=System.currentTimeMillis();
        System.out.println("LinkedList Construction Time "+ (end-start));
    }

    public static void main(String[] args) {
        Linked_List_Time it= new Linked_List_Time();
        it.arrayListTime();
        it.linkedListTime();
    }
}
