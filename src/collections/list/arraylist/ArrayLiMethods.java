package collections.list.arraylist;

import java.util.ArrayList;

public class ArrayLiMethods {
    public static void main(String[] args) {

        ArrayList al=new ArrayList();
        al.add(10);
        al.add(10.5);
        al.add("naresh");
        al.add("Ratan");
        al.add(10);
        al.add(null);
        System.out.println(al);
        System.out.println(al.size());

        al.add(3,"anu"); // adding the value in 3 index position.
        System.out.println(al);

        al.remove(2); // remove the data in 2 index
        System.out.println(al);

        al.set(1,"veer"); // set will replace the data on 1 index.
        System.out.println(al);

        System.out.println(al.isEmpty()); // isEmpty() check the al is empty or not it will return true of false.

        al.clear(); // clear() method clear the arralist.
        System.out.println(al);
        System.out.println(al.isEmpty());
    }
}


// add();--> adding the value b default at last
//add(index,value) -> adding the data at specific position
// size()--> size of the arrayList
// remove(value) --> remove a data from specific position.
// remove(index) --> remove a data from specific position.
// set(index,value)--> replace the data at specific index position.
// isEmpty();--> check is empty or not.
// clear()--> clear the array.

