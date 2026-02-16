package Arrays;

import java.util.Arrays;

public class Employee {
    String name;
    int id;

    Employee(String name,int id){
        this.name=name;
        this.id=id;
    }

    public static void main(String[] args) {
        Employee [] emp=new Employee[5];
        emp[0]=new Employee("Ram",101);
        emp[1]=new Employee("Akash",102);
        emp[2]=new Employee("Natha",103);
        emp[3]=new Employee("Bashu",104);
        emp[4]=new Employee("Veer",105);
        //emp[5]=new Employee("Veer",105); // ArrayIndexOutOfBoundsException

        for(int i=0;i<emp.length;i++){
            System.out.println("Name of the Employee is : "+ emp[i].name+" And Id is : "+ emp[i].id);
        }

    }
}
