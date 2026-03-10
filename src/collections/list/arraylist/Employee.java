package collections.list.arraylist;

public class Employee {
    int Id;
    String name;


    public Employee(int id, String name) {
        Id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}
