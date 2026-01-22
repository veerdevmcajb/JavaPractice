package garbageCollector;

public class Emp {
    public void finalize(){
        System.out.println("Emp obj destroyed");
    }
}

class Student{
    public void finalize(){
        System.out.println("Student obj destroyed");
    }
}

class Test{
    public void finalize(){
        System.out.println("Test obj destroyed");
    }

    public static void main(String[] args) {
        TestGc t=new TestGc();
        t=null;
        Emp e=new Emp();
        e=null;
        Student s=new Student();
        s=null;
        System.gc();
    }
}

//At runtime which class object destroyed that class finalize method executed.