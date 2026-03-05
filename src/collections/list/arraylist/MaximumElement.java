package collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class MaximumElement {

    public static void main(String[] args) {

        List<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(40);
        al.add(25);
        al.add(5);

        int max=al.get(0);

        for(int i=1;i<al.size();i++){
            if(al.get(i)> max){
                max=al.get(i);
            }
        }

        System.out.println("Maximun Element is "+ max);
    }
}
