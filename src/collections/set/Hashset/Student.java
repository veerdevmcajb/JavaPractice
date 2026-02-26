package collections.set.Hashset;

import java.util.Arrays;
import java.util.HashSet;

public class Student {
    String name;

    Student(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Student s1=new Student("Natha");
        Student s2=new Student("Shiva");
        Student s3=new Student("Bablu");
        Student s4=new Student("Bablu");

        HashSet<Student> hs=new HashSet<>(Arrays.asList(s1,s2,s3,s4,s4,s3));


        System.out.println("Size is : " + hs.size()); // 4
        System.out.println("Using Stream we can get the data");
        hs.stream().distinct().forEach(System.out::println);

        System.out.println("Removing The Duplicates name");
        // if we want to remove duplicate names .
        hs.stream().map(e->e.name).distinct().forEach(e-> System.out.println(e));

    }

}
