package collections.list.arraylist;

import java.util.concurrent.CopyOnWriteArrayList;

// Fail safe Collection
public class FailSafeCollection {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> cwal=new CopyOnWriteArrayList<>();
        cwal.add(100);
        cwal.add(200);
        cwal.add(300);
        cwal.add(400);

        for(int i:cwal){
            System.out.println(i);
            if(i==100){
                cwal.add(500);
            }
        }
        System.out.println(cwal);
    }
}
