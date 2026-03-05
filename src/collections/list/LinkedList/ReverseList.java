package collections.list.LinkedList;

import java.util.LinkedList;

public class ReverseList {

    public static void main(String[] args) {

        LinkedList<Integer> list=new LinkedList();
        list.add(50);
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(10);

        System.out.println(list);

        System.out.println("-----Reverse a list------------");
        for(int i=list.size()-1; i>=0;i--){
            System.out.print(list.get(i) + " ");
        }

    }
}
