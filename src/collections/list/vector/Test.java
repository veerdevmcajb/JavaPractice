package collections.list.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Test {

    public static void main(String[] args) {

        Vector<Object> v =new Vector<>();
        System.out.println(v.capacity());
        System.out.println(v.size());

        v.add(10);
        System.out.println(v.capacity());
        System.out.println(v.size());
        System.out.println(v);

        v.add("a");
        v.add("b");
        v.add("c");
        v.add(25);
        v.add(50);
        v.add(50);
        v.add(null);
        v.add("a");
        v.add(null);
        v.add(null);
        v.add(new Ex(5,6));


        System.out.println(v);
        System.out.println("Capacity "+ v.capacity());
        System.out.println("Size is "+ v.size());

        System.out.println("Retriving the elements using Enumeration Iterator ");
        Enumeration e= v.elements();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        System.out.println("Using Iterator ");
        Iterator irt=v.iterator();
        while (irt.hasNext()){
            System.out.println(irt.next());
        }

        System.out.println("using List Iterator");

        ListIterator li=v.listIterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }

        System.out.println("First Element "+ v.firstElement());
        System.out.println("get "+ v.get(4));
        System.out.println("Last Element "+ v.lastElement());
        System.out.println("Clone " + v.clone());

        System.out.println("================================");
        for(Object o:v){
            System.out.println(o);
        }

        System.out.println("===============using forEach() =================");

        v.forEach(obj -> System.out.println(obj));


    }
}
