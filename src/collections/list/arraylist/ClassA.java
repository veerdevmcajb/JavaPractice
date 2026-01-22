package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

// ArrayList example with ArrayList Methods.
public class ClassA {

    void meth1(){
        System.out.println("Implementing ArrayList");
        ArrayList al=new ArrayList();   // creating ArrayList
        al.add(10);                     // adding the object in the arrayList
        al.add("java");
        al.add(null);
        al.add(75);
        al.add(42);
        al.add(10);
        al.add(96);
        al.add(12);
        al.add(1);
        al.add("java");
        System.out.println("ArrayList : "+al);
        System.out.println();

        System.out.println("----------------Arraylist Methods()------------------------ ");
        System.out.println("Size is : "+ al.size());
     //   System.out.println("isEmpty : "+ al.isEmpty()); // false
//        al.clear(); // it will remove all the data from Arraylist.
//        System.out.println("isEmpty : "+ al.isEmpty()); // true

        System.out.println("Contains : "+ al.contains("java"));
        System.out.println("remove : "+ al.remove(5)); // removing using index position
        System.out.println("remove : "+ al.remove((Object) 75)); // removing the object so that we have to typecast.

        al.add(2,100);
        System.out.println( al);

        System.out.println("Access the obj using get() : "+ al.get(1));
        System.out.println("indexOf : "+al.indexOf("java"));
        System.out.println("lastIndexOf : "+al.lastIndexOf("java"));
        System.out.println();

        System.out.println("------- Retrieving  the elements using for loop ----------");
        for(int i=0;i<al.size();i++){
            System.out.println("index of "+ i +" -> "+ al.get(i));
        }
        System.out.println();

       System.out.println("------- Retrieving the elements using for-each loop ----------");
        for (Object o : al){
            System.out.println(o);
        }
        System.out.println();

        System.out.println("------- Retrieving the elements using Iterator Interface ----------");
        Iterator it= al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

    public static void main(String[] args) {
        ClassA obj=new ClassA();
        obj.meth1();
    }
}
