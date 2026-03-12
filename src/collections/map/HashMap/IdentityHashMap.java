package collections.map.HashMap;

import java.util.Map;

/*  java map liken (hashMap ) compare keys using
    equals() --> check logical equality.
    hashcode() --> determine bucket location.

    But IdentityHashMap uses
    == -> to check if two reference points to the exact same object or not.
     str1.equals(b) --> true
*    str1==str2 --> false
      Identity Hashmap uses == , it treated them as two different keys.
* */
public class IdentityHashMap {
    public static void main(String[] args) {

        String str1=new String("key");
        String str2= new String("key");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        Map map=new java.util.IdentityHashMap();
        map.put(str1,"natha");
        map.put(str2,"Bablu");

        System.out.println(map);

        System.out.println("==========");

        System.out.println("a".hashCode());
        System.out.println("a".hashCode() % 16);

        System.out.println("5.6".hashCode()%16);
        System.out.println("6.5".hashCode() % 16);

        System.out.println(new String("a").hashCode() % 16);


    }
}
