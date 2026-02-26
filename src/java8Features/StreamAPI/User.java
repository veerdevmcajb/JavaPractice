package java8Features.StreamAPI;

import java.util.stream.Stream;

// Q WAP to print The Users Whose age is Greater than or equal to 18.
public class User {
    int age;
    String name;

    User(int age,String name){
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        return age + " : "+ name;
    }

    public static void main(String[] args) {
        User u1=new User(25,"Akash");
        User u2=new User(30,"Natha");
        User u3=new User(15,"Vijay");
        User u4=new User(10,"Shiv");
        User u5=new User(35,"Veer");
        User u6=new User(19,"Ashok");

        // Q WAP to print The Users Whose age is Greater than or equal to 18.
        Stream<User> stream=Stream.of(u1,u2,u3,u4,u5,u6);
        //stream.filter(u->u.age>=18).forEach(i-> System.out.println(i));

        // Q Wap to print the Users whose age is Greater Than 18 && Names Starts With A
       // stream.filter(u->u.age>18 && u.name.startsWith("A")).forEach(u-> System.out.println(u));

        // we can apply filters two times also.
        stream.filter(u->u.age>=18).filter(u->u.name.startsWith("A")).forEach(u-> System.out.println(u));
    }
}


