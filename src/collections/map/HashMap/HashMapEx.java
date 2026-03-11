package collections.map.HashMap;

import java.util.HashMap;

public class HashMapEx {

    public static void main(String[] args) {

        HashMap<Object,Object> hm = new HashMap<>();
        System.out.println("Size is " + hm.size());
        System.out.println(hm);

        System.out.print(hm.put("a",101)); // null because it check key is already exist or not if exit then return that or not exist return null.
        System.out.println("\t"+ hm);

        System.out.print(hm.put("b",201));      System.out.println("\t"+ hm);
        System.out.print(hm.put(5,301));      System.out.println("\t"+ hm);
        System.out.print(hm.put(7.5,401));      System.out.println("\t"+ hm);
        System.out.print(hm.put("p",601));      System.out.println("\t"+ hm);
        System.out.print(hm.put(null,501));      System.out.println("\t"+ hm);
        System.out.print(hm.put(97,601));      System.out.println("\t"+ hm);
        System.out.print(hm.put(98,701));      System.out.println("\t"+ hm);
    }
}
