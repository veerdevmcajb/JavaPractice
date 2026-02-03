package collections.list.arraylist;

public class Student implements Comparable<Student>{
    int id;
    String name;


    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }



    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student s) {
       // return this.id - s.id; // sorting the obj data on id.
        return this.name.compareTo(s.name); //(when it is String use compareTO()) sorting the data on name
    }
}
