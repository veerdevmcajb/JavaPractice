package collections.Sorting.comparator;

import java.util.Comparator;
import java.util.TreeSet;

public class Student {
    Integer id;
    String name;

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
       return this.id+" : "+ name;
    }

}

class SortBySName implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Student s1=(Student) o1;
        Student s2=(Student) o2;
        return s1.name.compareTo(s2.name);
    }
}

class SortBySId implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Student s1=(Student) o1;
        Student s2=(Student) o2;
        return s1.id.compareTo(s2.id);
    }
}


class SortStudents{
    public static void main(String[] args) {
        //TreeSet<Student>ts=new TreeSet<>(new SortBySName());
        TreeSet<Student>ts=new TreeSet<>(new SortBySId()); // pass the reference of that class obj which you want to perform operations.
        ts.add(new Student(101,"Natha"));
        ts.add(new Student(301,"Akash"));
        ts.add(new Student(201,"Vijay"));

        System.out.println(ts);

        // Collection.sort cannot be applied on TreeSet  it is applicable only on the List.
       // Collections.sort(ts,(s1,s2)->s1.id-s2.id);


    }
}