package collections.Sorting;
import java.util.*;
public class EmpDemo {
    public static void main(String[] args) {
        ArrayList<Employee>emps=new ArrayList<>();
        emps.add(new Employee(105,"Balu",55000));
        emps.add(new Employee(103,"Vijay",85000));
        emps.add(new Employee(101,"Akash",45000));
        emps.add(new Employee(104,"cathy",75000));
        emps.add(new Employee(102,"dino",60000));

        Collections.sort(emps,new EmpIdComparator());
        Collections.sort(emps,new EmployeeNameComparator());

        // anonymous implementation for sorting object
        Collections.sort(emps, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return (int) ( e2.salary-e1.salary ); // desending ordr
               // return (int) ( e1.salary - e2.salary ); // Assending ordr
            }
        });

        for (Employee e:emps){
            System.out.println(e);
        }
    }
}
