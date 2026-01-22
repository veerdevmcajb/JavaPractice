package collections.Curser;

import java.util.ArrayList;
import java.util.Iterator;

public class CurserEx1 {
    public static void main(String[] args) {
        ArrayList<String>objs=new ArrayList<String>();
        objs.add("Ratan");
        objs.add("anu");
        objs.add("natha");
        objs.add("Bablu");

        //read the data using for-each loop
        for(String s:objs){
            System.out.println(s);
        }

        System.out.println("_____________________");
        //read the data using get()method
        String name=objs.get(3);
        System.out.println(name);

        // read the data using curser : Iterator
        Iterator itr=objs.iterator();
        while (itr.hasNext()){
            String s=(String)itr.next();
            System.out.println(s);
        }

        System.out.println("------------------------");

        // Read the data using generics curser : Iterator

        Iterator<String> sitr=objs.iterator();
        while (sitr.hasNext()){
            String s=sitr.next();
            System.out.println(s);
        }
        System.out.println("************************");

        // Reading the data using forEach method : using Lambda
        objs.forEach(str-> System.out.println(str));

        System.out.println("_____________________");

        //Reading the data using forEach()method : using method reference
        objs.forEach(System.out::println);
    }
}
