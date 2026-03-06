package collections.list.arraylist;

import java.util.ArrayList;

public class Test1 {


        public static void main(String[] args) {

            ArrayList<Integer> list = new ArrayList<>();

            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);

            for(int i = 0; i < list.size(); i++) {
                if(list.get(i) == 20 || list.get(i) == 30) {
                    list.remove(i);
                }
            }

            System.out.println(list);   // 10,30,40
        }
}


