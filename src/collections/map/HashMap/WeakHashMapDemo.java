package collections.map.HashMap;

import java.util.Map;
import java.util.WeakHashMap;


/*  WeakHashMap is a HashMap where entries disappear automatically
    when their keys are no longer used in the program.

    entries in the map can be automatically removed by
    the Garbage Collector when the key is no longer
    strongly referenced elsewhere.
*
* */

class Employee{
    int id;
    String name;

    Employee(int id, String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return id+ " "+ name;
    }
}
 class WeakHashMapDemo {
    public static void main(String[] args) {

       Map map =new  WeakHashMap();
        map.put(new Employee(101,"Veer"),10);
        map.put(new Employee(102,"Abhi"),11);

        System.out.println(map);
        System.gc();
        System.out.println(map);

    }
}




// example 2 WeakHashMap
class Test1 {
    public static void main(String[] args) {

        WeakHashMap<String, String> map = new WeakHashMap<>();

        String key = new String("A");
        map.put(key, "Apple");

        System.out.println("Before GC: " + map);

        key = null;   // remove strong reference

        System.gc();  // request garbage collection

        System.out.println("After GC: " + map);
    }
}