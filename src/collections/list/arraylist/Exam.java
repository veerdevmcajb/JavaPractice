package collections.list.arraylist;

import java.util.ArrayList;

public class Exam {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(1);
        al.add(2);
        al.add(3);
        int x=al.indexOf("1");
        int y=al.lastIndexOf(3);
        System.out.println(y);
    }

}
