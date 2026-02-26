package java8Features.StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    String name;
    int age;
    double salary;

    public Employee( String name,int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                ", salary=" + salary +
//                '}';
//    }

    public static void main(String[] args) {
        Employee e1=new Employee("Veer",25,50000);
        Employee e2=new Employee("Akash",28,75000);
        Employee e3=new Employee("Natha",30,100000);
        Employee e4=new Employee("Vijay",18,75000);
        Employee e5=new Employee("Abhishek",27,45000);

        List<Employee> list= Arrays.asList(e1,e2,e3,e4,e5);

       // Stream<Employee>stream=Stream.of(e1,e2,e3,e4,e5);


        //Wap Get emp name and emp age whose sal is greater than 50000

        System.out.println("Emp Name & age whose sal is greater that 50000");
        list.stream().filter(e->e.salary>50000).forEach(e-> System.out.println(e.name +" "+ e.age));  // without map

//        list.stream.filter(e->e.salary>50000)
//                .map(e->e.name +" "+ e.age)
//                .forEach(e-> System.out.println(e)); // with map


        // Q. WAP to get MAX ,MIN, and AVG salary

            Optional<Employee> max = list.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.salary)));
            System.out.println("Max salaray is : "+max.get().salary);

        // min salary

            Optional<Employee>min=list.stream().collect(Collectors.minBy(Comparator.comparing(e->e.salary)));
        System.out.println("Min salary is : "+ min.get().salary);

        // avg salary
        double avgSalary = list.stream().collect(Collectors.averagingDouble(e->e.salary));
        System.out.println("AvgSalary is : "+ avgSalary);
    }
}
