package collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class DuplicateList {

    public static void main(String[] args) {

        List<Integer> al=new ArrayList<>();
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(2);
        al.add(3);

        for(int i=0;i<al.size();i++){
            for(int j=i+1; j<al.size();j++){

                if(al.get(i).equals(al.get(j))){
                    System.out.println("Duplicate elements : "+ al.get(i));
                }
            }
        }
    }
}
