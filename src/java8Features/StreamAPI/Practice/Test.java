package java8Features.StreamAPI.Practice;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<Integer> list2 = Arrays.asList(10,20,50,70,8,2);
        list2.stream().filter(e->e/10==0).map(e->e*2).forEach(System.out::println);

//        Employee e1 = new Employee(3221, "Rakesh", 125);
//        Employee e2 = new Employee(3222, "Rohan", 128);
//        Employee e3 = new Employee(3223, "Aman", 150);
//        Employee e4 = new Employee(3224, "Kartik", 165);
//        Employee e5 = new Employee(3225, "Mehul", 185);
//        Employee e6 = new Employee(3230, "Shreshth", 200);
//        List<Employee> employeeList = new ArrayList<>();
//
//        List<Integer> sal= stream.of(e1,e2,e3,e4,e5,e6).map(s->s.getSalary()).toList();
//        System.out.println(sal);

//        List<Integer> sal= Stream.of(e1,e2,e3,e4,e5,e6).map(s->s.getSalary()).sorted(Comparator.reverseOrder()).skip(1).limit(1).toList();
//        System.out.println(sal);


    }
}
