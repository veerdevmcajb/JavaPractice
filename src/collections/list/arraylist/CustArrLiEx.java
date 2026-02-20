package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class CustArrLiEx {
    public static void main(String[] args) {
        CustomArrayList al=new CustomArrayList(10);
       // ArrayList al=new ArrayList(10);
        al.add(10);
        al.add("Java");
        al.add(50);
        al.add('S');
        al.add('h');
        al.add('h');
        al.add('h');
        System.out.println(al);
        System.out.println(al.get(1));
//       for(int i=0;i<al.size();i++){
//           System.out.println(al.get(i));
//       }
//        System.out.println("-------using Iterator---------------");
//
//       Iterator it=al.iterator();
//       while (it.hasNext()){
//           System.out.println(it.next());
//       }

        System.out.println("Size od Array is "+ al.size());
        System.out.println(al.get(3));
        System.out.println("Remove Element is "+al.remove(3));
        System.out.println(al.size());
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.get(8));
    }
}
