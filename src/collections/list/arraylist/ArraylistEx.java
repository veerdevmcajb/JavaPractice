package collections.list.arraylist;

import java.util.ArrayList;

public class ArraylistEx {
    public static void main(String[] args) {

        // Arrays are type safe
        int []arr={10,20,30,40,50};
        for(int aa:arr){
            System.out.println(aa);
        }

        // Collections are not type safe
        ArrayList obj=new ArrayList();
        obj.add(new Employee(101,"RAm"));
        obj.add(new Student("Atul",01));
        for(Object o :obj){
            if(o instanceof Employee) {
                Employee e=(Employee) o;
                System.out.println(e.Id +" "+e.name);
            }
            if(o instanceof Student){
                Student s=(Student) o;
                System.out.println(s.id +" "+ s.name);
            }
        }
        Student ss=(Student)obj.get(1);
        System.out.println(ss.id+" "+ ss.name);

        // use generics provide the type safty to collections
        ArrayList<Employee> emps=new ArrayList<Employee>();
        emps.add(new Employee(102,"Shyam"));
        emps.add(new Employee(103,"Natha"));
        emps.add(new Employee(104,"Akash"));
        for(Employee e:emps){
            System.out.println(e.Id +" " + e.name);
        }
        Employee e=emps.get(0);
        System.out.println(e.Id + " "+ e.name);

    }
}
