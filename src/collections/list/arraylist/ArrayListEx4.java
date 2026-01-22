package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx4 {
    public static void main(String[] args) {

        // if you want a same object multiple times / duplicate data
        ArrayList<String> obj=new ArrayList<String>(Collections.nCopies(10,"Shiv"));
        System.out.println(obj);

        //if we want to swap the data in arraylist we can use Collections.swap() method

        ArrayList<String> a1=new ArrayList<String>();
        a1.add("Atul");
        a1.add("Natha");
        a1.add("Vijay");
        a1.add("Akash");
        a1.add("Nilesh");

        System.out.println("Before swapping data : "+ a1);
        Collections.swap(a1,1,3);
        System.out.println("after Swapping data : "+ a1);
    }
}
