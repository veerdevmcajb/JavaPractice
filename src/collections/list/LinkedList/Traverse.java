package collections.list.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Traverse {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("Python");
        list.add("Sql");
        list.add("C++");

        for(String s:list){
            System.out.println(s);
        }
        System.out.println("------ Using ListIterator()--------");

        Iterator i=list.listIterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }

        System.out.println("==========Using ListIterator==============");

       Iterator it=list.iterator();
       while (it.hasNext()){
           System.out.println(it.next());
       }

        System.out.println("===========Using forEach() method ===========");
       list.forEach(s-> System.out.println(s));
    }
}
