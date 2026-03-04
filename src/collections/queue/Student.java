package collections.queue;

import java.util.PriorityQueue;
// Q. PriorityQueue with Custom Objects

public class Student {
    int id;
    String name;

    Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public String toString() {
        return id +" "+ name;
    }
}

class PqStudent{

    public static void main(String[] args) {

       // PriorityQueue<Student> pq = new PriorityQueue<>((a,b)->a.id- b.id); // sorting by Id.
        PriorityQueue<Student> pq = new PriorityQueue<>((a,b)->a.name.compareTo(b.name)); // sorting by Name.

        pq.add(new Student(3,"Akash"));
        pq.add(new Student(2,"Bablu"));
        pq.add(new Student(1,"Shiv"));

        System.out.println(pq);

        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
