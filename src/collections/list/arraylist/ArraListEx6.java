package collections.list.arraylist;

import java.util.ArrayList;

public class ArraListEx6 {
    public static void main(String[] args) {

        Employee e1=new Employee(101,"Raj");
        Employee e2=new Employee(102,"Shyam");
        Employee e3=new Employee(103,"Veer");
        Employee e4=new Employee(104,"Atul");

        ArrayList<Employee> a1=new ArrayList<Employee>();
        a1.add(e1);
        a1.add(e2);

        ArrayList<Employee> a2=new ArrayList<Employee>();
        a2.addAll(a1);
        a2.add(e3);
        a2.add(e4);

        System.out.println(a2.contains(e1)); //true
        System.out.println(a2.containsAll(a1)); // true


        a2.remove(e1);
        System.out.println(a2.contains(e1)); // false
        System.out.println(a2.containsAll(a1)); // false

        for(Employee e:a2){
            System.out.println(e.Id+" "+e.name);
        }

    }
}
