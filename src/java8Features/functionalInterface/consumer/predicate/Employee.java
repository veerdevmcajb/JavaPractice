package java8Features.functionalInterface.consumer.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Employee {
    String name;
    String location;
    String dept;

    Employee(String name,String location,String dept){
        this.name=name;
        this.location=location;
        this.dept=dept;
    }
}

class PredicateJoinDemo{
    public static void main(String[] args) {
        Employee e1=new Employee("Akash","Pune","DB");
        Employee e2=new Employee("Raju","Chennai","Devops");
        Employee e3=new Employee("Akshay","Hyd","DB");
        Employee e4=new Employee("Shyam","Hyd","Testing");
        Employee e5=new Employee("Ram","Pune","Networking");

        List<Employee> emps= Arrays.asList(e1,e2,e3,e4,e5);

        Predicate<Employee> p1=(e)->e.location.equals("Hyd");
        Predicate<Employee> p2=(e)->e.dept.equals("DB");
        Predicate<Employee> p3=(e)->e.name.startsWith("A");

        //Predicate Joining--> To Combine Multiple Predicates we will use Predicate Joining.
        //  and() method , or() method
        Predicate<Employee>p=p1.or(p2).or(p3);
        //Predicate<Employee>p=p1.and(p2).and(p3);

        for(Employee e:emps){
            if(p.test(e)){
                System.out.println(e.name+" "+ e.dept);
            }
        }
    }
}
