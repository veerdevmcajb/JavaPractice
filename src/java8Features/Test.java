package java8Features;

import java.util.TreeSet;
class Student implements Comparable{
    Integer sid;
    String sname;

    public Student(Integer sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    @Override
    public int compareTo(Object o) {
       Student student=(Student)o;
       return -this.sname.compareTo(student.sname);
    }

//    @Override
//    public int compareTo(Object o) {
//        Student s= (Student) o;
//        return this.sid.compareTo(s.sid);
//    }



    @Override
    public String toString() {
        return this.sid+": "+ sname;
    }
}
public class Test {
    public static void main(String[] args) {
        TreeSet<Student> ts= new TreeSet<>();
        ts.add(new Student(25, "shiva"));
        ts.add(new Student(12, "natha"));
        ts.add(new Student(30, "babloo"));

        System.out.println(ts);    // ts.toString()
    }
}
