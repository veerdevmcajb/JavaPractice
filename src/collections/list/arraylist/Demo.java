package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

// we are sorting the object data. by using Comparable Interface.
/*  If we want to apply sorting on user define object like student ,Employee,product etc...
    then we have two approach
    1) Comparable (java.lang)
    2) Comparator (java.util)

    -> Comparable is a predefine interface available in java.lang pack.
    -> Comparable interface having CompareTo(Object obj)method
    -> compareTo()method is used to compare an object with itself and return int value.
    -> comparable interface will allow us to sort the data based on only one value.

    - To overcome this problem we will go for Comparator Interface.
    - Comparator is a predefine interface available in java.util package.
    - Comparator interface having compare(Object obj1,Object obj2)
    -> comparator interface will allow us to sort the data of multiple value.

* */
public class Demo {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student("Veer",101));
        al.add(new Student("Shiv",104));
        al.add(new Student("Smith",102));
        al.add(new Student("Rohit",103));

        System.out.println(al);
        Collections.sort(al);

        // if we don't create a toString in Students Class
        for(Student s:al){
            Student student=s;
            System.out.println(s.id+" "+s.name);
        }

        for(Student s:al){
            System.out.println(s);
        }
    }
}
