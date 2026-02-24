package java8Features;


import garbageCollector.Emp;

import java.util.*;

class Employee{
    Integer eid;
    String ename;

    public Employee(Integer eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

    @Override
    public String toString() {
        return this.eid+": "+ename;
    }
}

class SortByName implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1= (Employee)o1;
        Employee e2= (Employee)o2;
        return -e1.ename.compareTo(e2.ename);
    }
}

class SortById implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Employee e1= (Employee)o1;
        Employee e2= (Employee)o2;
        return -e1.eid.compareTo(e2.eid);//25 to 12

    }
}

public class Demo {
    public static void main(String[] args) {
        TreeSet<Employee> ts= new TreeSet<>(new SortById());
        ts.add(new Employee(25,"natha"));
        ts.add(new Employee(5,"Aamdar"));
        ts.add(new Employee(12,"shiva"));

        System.out.println(ts);


        ArrayList<String> al= new ArrayList<>(Arrays.asList("apple", "bat","zebra"));
        al.sort((o1,o2)-> -o1.compareTo(o2));
        System.out.println(al);
        Collections.reverse(al);
        System.out.println(al);
    }
}
