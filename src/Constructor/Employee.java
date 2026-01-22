package Constructor;

public class Employee {
    int eid;
    String ename;
    double salary;
    String company;
    String add;

    Employee(int eid, String ename, double salary, String company, String add ){
        this.eid=eid;
        this.ename=ename;
        this.salary=salary;
        this.company=company;
        this.add=add;

    }

    void status(){
        if(salary > 15000){
            System.out.println(ename +" is Very Good Employee");
        }
        else {
            System.out.println(ename + " is Good Employee");
        }
    }

    public static void main(String[] args) {
        Employee e1=new Employee(101,"Veer",18000,"TCS","Nanded");
        e1.status();
        Employee e2=new Employee(102,"abc",13000,"Wipro","Pune");
        e2.status();
    }
}
