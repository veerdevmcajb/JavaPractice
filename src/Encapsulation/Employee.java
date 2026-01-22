package Encapsulation;

import java.util.Scanner;

public class Employee {

    private String empName;
    private int empId;
    private double salary;
    private String empDept;
    private String empAdd;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public String getEmpAdd() {
        return empAdd;
    }

    public void setEmpAdd(String empAdd) {
        this.empAdd = empAdd;
    }
}
class EmpTest{
    void details(){
        Scanner sc=new Scanner(System.in);
        Employee e=new Employee();
        System.out.println("Enter Emp Name");
        e.setEmpName(sc.nextLine());
        System.out.println("Enter a Emp Id");
        e.setEmpId(sc.nextInt());
        System.out.println("Enter Emp salary");
        e.setSalary(sc.nextDouble());
        System.out.println("Enter Emp Dept");
        e.setEmpDept(sc.next());
        sc.nextLine();
        System.out.println("Enter a Emp Address");
        e.setEmpAdd(sc.nextLine());


        System.out.println("----------------------------------");
        System.out.println("Emp Name is : " + e.getEmpName());
        System.out.println("Emp Id is : " + e.getEmpId());
        System.out.println("Emp Salary is : " + e.getSalary());
        System.out.println("Emp Dept is : " + e.getEmpDept());
        System.out.println("Emp Address is : " + e.getEmpAdd());
    }

    public static void main(String[] args) {
        new EmpTest().details();
    }
}
